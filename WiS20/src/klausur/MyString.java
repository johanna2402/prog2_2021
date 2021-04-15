package klausur;

import java.util.Arrays;

public class MyString {
	
	private char[] wort;
	
	

	public MyString() {
		this.wort=new char[0];
	}
	
	public MyString(char c)
	{
		
		this.wort=new char[1];
		wort[0]=c;
		
	}
	
	public MyString (String s) {
		this.wort = new char [s.length()];
		for (int index = 0; index < s.length(); index++) {
			wort[index] = s.charAt(index);
		}
		
	}

	
	
	@Override
	public String toString() {
		return "MyString [wort=" + Arrays.toString(wort) + "]";
	}

	public void print() {
		System.out.println(this.toString());
	}
	
	public int getLength() {
		return wort.length;
	}
	
	
	boolean contains(char c) 
	{
		
		for (int index = 0; index < this.wort.length; index++) 
		{
			if(this.wort[index] == c)
			{
				return true;
			}
		}
		
		return false;

	}

	@Override
	public boolean equals(Object o) {
		
		 if (o == null) return false;
		 if (this==o) return true;
		 if (this.getClass()!=o.getClass()) return false;
		 
		 
		 MyString owort = (MyString)o;
		 if (wort.length == o.length) return true;
	}

	public void append(char c) 
	{
		
		char[] kopie = new char[this.wort.length + 1];
		for (int index = 0; index < this.wort.length; index++) {
			kopie[index] = this.wort[index];
		}
		kopie[kopie.length - 1] = c;
		this.wort = kopie;
		
		
	}
	 
	
		
	}
	
	
	
}