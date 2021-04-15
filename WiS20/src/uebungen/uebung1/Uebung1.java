package uebungen.uebung1;

public class Uebung1 
{
	public static int getQuotient(int nr1, int nr2 ) 
	{
		int quotient = nr1 / nr2;
		
		return quotient;
		
	}
	
	public static int getRemainder(int nr1, int nr2)
	{
		int rest = nr1 % nr2;
		return rest;
		
		
			
	}
	

		
		
		public static void printIntDivision (int nr1, int nr2)
{
	int quotient = nr1 / nr2;
	int rest = nr1 % nr2;
	System.out.println(nr1 + " geteilt durch " + nr2 + " ergibt " + quotient +"." + " Es bleibt ein Rest von " + rest);
}

	




public static void main(String[] args) {
	
	
	int zahl1 = 2147483647; // eins höher geht nicht weil zu wenig bit/
	long langezahl = 456789; 
	char zeichen1 = 'a';
	byte kleineZahl = 127;
	short andereKleineZahl = 32767;
	float kommaZahl = 4.23f;
	double andereKommaZahl = 6.98;
	boolean condition1 = true;
	String hallo = "Hallo!";
	langezahl = 2147483648L;
	zeichen1 = 65; // großes A in zeichentabelle // 
	
	System.out.println(zahl1);
	System.out.println(langezahl);
	System.out.println(zeichen1);
	System.out.println(kleineZahl);
	System.out.println(andereKleineZahl);
	System.out.println(kommaZahl);
	System.out.println(andereKommaZahl);
	System.out.println(condition1);
	System.out.println(hallo);
	
	
			
	printIntDivision(7,4);
	printIntDivision(17, 4);
	printIntDivision(16,4);
	
	int dividieren = getQuotient(17,4);
	int remainder = getRemainder(17,4);
	
	System.out.println(17+ "/" + 4 + " = " + dividieren);
	System.out.println(17 + " mod " + 4 + " = " + remainder);

	}

}
