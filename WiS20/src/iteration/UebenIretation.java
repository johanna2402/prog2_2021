package iteration;

public class UebenIretation {
	
	
	
		    
public static void printRhombusFilled (int upperHalf) {
		
		int height = 2 * upperHalf +1; 
	

		        for(int row=0; row<height; row++)
		        {
		            for(int spaces = 1; spaces < height - row; spaces++)
		            {
		                System.out.print(" ");
		            }
		            for(int col = 0; col <= row + row ;col ++)
		            {
		            	
		            	System.out.print("*");
		            	
		            	 
		            }
		            System.out.println();
		        }
		        
		        for(int row=0; row<height; row++)
		        {
		        	   for(int spaces = height -1; spaces <height+row; spaces++)
			            {
			                System.out.print(" ");
			            }
		            
		            for(int col = row+1; col <height+(height-row-2) ;col ++)
		            {
		            	
		            	
		           
		            	System.out.print("*");
		            	
		            	 
		            }
		            System.out.println();
		        }
		        }

		
public static void printRhombusUnfilled (int upperHalf) {
	
	int height = 2 * upperHalf +1; 
	

    for(int row=0; row<height; row++)
    {
        for(int spaces = 1; spaces < height - row; spaces++)
        {
            System.out.print(" ");
        }
        for(int col = 0; col <= row + row ;col ++)
        {
        	if((col==0) || (col == row+row)) {
        	System.out.print("*");
        	
        	}
        	else {
        		System.out.print(" ");
        	}
        	 
        }
        System.out.println();
    }
    
    for(int row=0; row<height; row++)
    {
    	   for(int spaces = height -1; spaces <height+row; spaces++)
            {
                System.out.print(" ");
            }
        
        for(int col = row+1; col <height+(height-row-2) ;col ++)
        {
        	
        	
        	if(col==row+1 || col == height+(height-row-2)-1) {
            	System.out.print("*");
            	
            	}
            	else {
            		System.out.print(" ");
            	}
        	
        	
        	 
        }
        System.out.println();
    }
}
		       
		    	    
public static void main(String[] args) {
		
		printRhombusFilled(3);
		printRhombusUnfilled(3);
		
		
	}
}
	

	


