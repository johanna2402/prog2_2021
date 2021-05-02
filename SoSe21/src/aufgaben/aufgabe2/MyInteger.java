package aufgaben.aufgabe2;

public class MyInteger {
	
	public static final int MAX_VALUE = 2147483647;
	public static final int MIN_VALUE = -2147483646;
	private int value;
	
	public MyInteger(int value)
	{
		this.value = value;
	}
	public MyInteger(String s) throws IllegalArgumentException
	{
		this.value = parseInt(s);
	}
	
	static String removeLeadingZeros(String s) {
		while(s.charAt(0)=='0') {
			s=s.substring(1);
		}
		return s;
	}
	
	static boolean charIsDigit(char c) {
		return (c=='0' || c=='1' || c=='2' || c=='3' 
				|| c=='4' || c=='5' || c=='6' || c=='7' || c=='8' || c=='9');
	}
	
	static boolean inputIsNumber(String s) {
		for (int i = 0; i < s.length(); i++) {
			if(!charIsDigit(s.charAt(i))) {
				return false;
			}
		}
		
		return true;
	}
	
	static int charToInt(char c) {
		int charAsciiValue = c;
		int intValue = charAsciiValue - 48;
		return intValue;
	}
	
	public static int parseInt(String s) throws IllegalArgumentException{
		
		if(s.length()==0) throw new IllegalArgumentException("leere Eingabe");
		boolean negative = false;
		if(s.charAt(0)=='+') {
			s=s.substring(1);
		}
		else if(s.charAt(0)=='-') {
			s=s.substring(1);
			negative=true;
			}
		if(s.length()==0) throw new IllegalArgumentException("Eingabe ist nur +/- also keine Zahl");
		s=removeLeadingZeros(s);
		if(!inputIsNumber(s)) throw new IllegalArgumentException(" Die Eingabe ist keine Zahl");
		
		int zahl=0;
		int exponent=1;
		
		for (int i = s.length()-1; i >=0; i--) {
			zahl= zahl+charToInt(s.charAt(i)) * exponent;
			exponent *=10;
		}
		 if (negative) return -zahl;
		 else return zahl;
	}
	
	int intValue() {
		return this.value;
	}
	double doubleValue() {
		return this.value;
	}
	
	static MyInteger valueOf(String s) throws IllegalArgumentException {
		return new MyInteger(s);
	}
	static MyInteger valueOf(int value)  {
		return new MyInteger(value);
	}
	@Override
	public int hashCode() {
		
		return this.value;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MyInteger other = (MyInteger) obj;
		if (value != other.value)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "MyInteger = " + value ;
	}
	
}


