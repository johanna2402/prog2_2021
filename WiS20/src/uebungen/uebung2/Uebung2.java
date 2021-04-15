package uebungen.uebung2;

public class Uebung2 {
	
	
	public static void printTimeTables (int nr1, int nr2) {
		
		for (int zahl1 = 1; zahl1 <=nr1; zahl1 ++) 
		{
			System.out.println();
			
			for(int zahl2 = 1; zahl2 <= nr2; zahl2++) {
				
				System.out.println(zahl1 + "*" + zahl2 + "=" + (zahl1*zahl2));
				
				}
			}
	}
			
		public static void printTimesMatrix(int nr1, int nr2) {
			
             for (int zahl1 = 1; zahl1 <= nr1; zahl1++) {
            	 
            	 System.out.println();
            	 
            	 for (int zahl2 = 1; zahl2 <= nr2; zahl2 ++) {
            		 
            		 System.out.print(zahl2*zahl1);
            	 }
             }
				
				
					
				
			
			
		}
			
			
			
		
		

		
		
		

		
	
	
	

	public static void main(String[] args) {
		
		printTimeTables(10,10);
		printTimesMatrix(10,10);
		


	}

}
