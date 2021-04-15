package uebungen.uebung4;

public class Uebung4 {
	
	public static void print(char[] ca) {
		
		System.out.print("[ ");
		for (int index = 0; index < ca.length -1; index++) {
			
			System.out.print(ca[index] + ", ");
			
		}
		if(ca.length!=0) {
			System.out.print(ca[ca.length-1]);
		}
		
		System.out.println(" ]");
	}
public static void print(int[] ca) {
		
		System.out.print("[ ");
		for (int index = 0; index < ca.length -1; index++) {
			
			System.out.print(ca[index] + ", ");
			
		}
		if(ca.length!=0) {
			System.out.print(ca[ca.length-1]);
		}
		
		System.out.println(" ]");
	}

public static char[] stringToCharArray(String s) {
	
	char[] ca = new char[s.length()];
	
	for (int index = 0; index < ca.length; index++) {
		ca[index] =s.charAt(index);
		
		
	}
	
	return ca;
	
}
public static char[] filter(char[] original, char filter) {
	
	//filter(['a', 'b', 'c', 'a', 'c', 'a', 'b', 'c'], 'c') → ['a', 'b', 'a', 'a', 'b']
	//wie oft filter in original?
	//um laenge von copy zu ermitteln
	// copy.length = original.length - Anzahl des Vorkommens von filter in original
	
	int norOfOccurrences = 0;
	for (int index = 0; index < original.length; index++) {
		
		if(original[index]==filter)
		{
			norOfOccurrences++;
			
		}
	}
	//laenge von copy bestimmen
	//copy erzeugen
	int lengthCopy = original.length - norOfOccurrences;
	
	char[] copy = new char [lengthCopy];
	//jetzt alle Werte aus original kopieren ausser filter
	
	int indexCopy = 0;
	
	for (int index = 0; index < copy.length; index++) 
	{
		if(original[index] != filter) 
		{
			copy[indexCopy] = original[index];
			indexCopy++;
			
			
		}
		
	}
	
	return copy;
	
}

public static int[] minAndMax(int[]iarr) {
	
	int curMin = iarr[0];
	int curMax = iarr[0];
	
	for (int index = 1; index < iarr.length; index++) 
	{
		if(iarr[index] < curMin)
		{
			curMin = iarr[index];
			
		}
		if(iarr[index] < curMax)
		{
			curMax = iarr[index];
			
		}
		
		
	}
	int[] ra = {curMin, curMax};
	return ra;
	
}

public static int[] reverse(int[]iarr)
{
	int[] ra = new int [iarr.length];
	
	for (int index = 0; index < ra.length; index++) 
	{
		ra[index] = iarr[iarr.length-1-index];
		
	}
	return ra;
	
}


	public static void main(String[] args) {
		
		
		char[]carr1 = new char[10];
		carr1[0]= 'a';
		carr1[1]= 'b';
		carr1[2]= 'c';
		carr1[3]= 'd';
		carr1[4]= 'e';
		carr1[5]= 'f';
		carr1[6]= 'g';
		carr1[7]= 'h';
		carr1[8]= 'i';
		carr1[9]= 'j';
		
		char[] carr2 = {'a', 'b', 'c', 'a','c', 'a', 'b', 'c' };
		char[] carr3 = new char [0];
		
		
print(carr1);
print(carr2);
print(carr3);		

int [] iarr1= { 4,2,8,1,6,2,4,1,8};
print(iarr1);
	

char c1 = "Hallo".charAt(1);
System.out.println(c1);

char [] carr4 = stringToCharArray("HAllO FIW!");

print(carr4);

 char[] carr5 = filter(carr2, 'c');
print(carr2);
print(carr5);
//es fehlen zwei buchstaben


int[]minMax = minAndMax(iarr1);
print(iarr1);
print(minMax);



int[]iarr3 = reverse(iarr1);
print(iarr1);
print(iarr3);



	}

}
