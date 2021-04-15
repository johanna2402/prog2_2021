package uebungen.uebung3;

import java.util.Scanner;

public class Uebung3 {

	public static void main(String[] args) {
		int ganzeZahl = inputInt();
		System.out.println("Sie haben " + ganzeZahl + " eingegeben.");
		
		System.out.println(isPrime(ganzeZahl));
		
		printPrimeNumbers(61);
		

	}
	


    public static int inputInt() {
	
	   Scanner sc = new Scanner(System.in);
	   System.out.print("Geben sie ein Zahl ein: ");
	   int ganzeZahl = sc.nextInt();
	   sc.close();
	   return ganzeZahl;
      }
    
    public static boolean isPrime(int number) {
	   boolean isPrime = true; // true ist wichtig!
	   
	   if (number<2)
	   {
		   isPrime=false;
		   
	   }
		   
		   else {
		   
		      if(number==2)
		      {
			      isPrime=true;
			   
		      }
		      else {
		    	  
		    	  for(int divider=2; divider<number && isPrime ; divider++)
		    	  {
		    		  if( number%divider == 0)
		    		  {
		    			  isPrime=false;
		    			  
		    		  }
		    		  
		    		  
		    	  }
		      }
		   }
	   
	   
	   
	   return isPrime;
	   
   }
    public static void printPrimeNumbers(int maximum)
    {
       for (int number=1; number<=maximum; number ++)
       {
    	   if(isPrime(number)) {
    		   System.out.print(number+" ");
    		
    	   }
    	   else
    	   {
    		   System.out.print(". ");
    	   }
       }
  
    }
    
   
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}