package test1;

import java.util.Random;

public class Test3 {
	
	public static int[] createAndFillArray(int length, int fromInclusive, int toInclusive) 
	   {
			
			int[] a = new int[length];
		    Random r = new Random();  
		    int bound = (toInclusive - fromInclusive)+1;
		    for(int i=0; i<a.length; i++)
		    {
		    	
		    	if(toInclusive>fromInclusive) {
		        a[i]=r.nextInt(bound)+fromInclusive; //bound ist immer die angegebene zahl -1 
		    	}
		    }
		    return a;
			
		}
	
	public static void printTable(int[] a) 
	{
		System.out.print("| Index :    ");
        for(int index=0; index<a.length; index++)
        {
            System.out.printf(" | %2d   " , index );
            
        }
        System.out.println("|");
		
    	
    	System.out.print("|-------------");
        for(int index=0; index<a.length; index++)
        {
            System.out.printf("|%3s" , "-------");
            
        }
        System.out.println("|");
		
		
		
		System.out.print("| Wert :    ");
        for(int index=0; index<a.length; index++)
        {
            System.out.printf("  |%3d  " , a[index] );
            
        }
        System.out.println(" |");
		
		
	}

	public static void main(String[] args) {
		 Random r = new Random();
		
		int length = r.nextInt(10)+10;
		int[] arr1 = createAndFillArray(length, 20, 30);
		System.out.printf("%n%n%n----------- printTable -----------------%n%n%n");
		printTable(arr1);

	}

}
