package klausurII;

public class Rhombus {
	
	
	
	public static void printRhombusFilled(int height)
	{
	    for(int row=0; row<height; row++)
	    {
	        for(int spaces = 1; spaces < height - row; spaces++)
	        {
	            System.out.print(" ");
	        }
	        for(int col = 0; col <= row+row; col++)
	        {
	            System.out.print("*");
	        }
	        System.out.println();
	    }
	   
	        for(int row=0; row<height; row++)
	        {
	        	 for(int spaces = 1; spaces <=row+1; spaces++)
	 	        {
	 	            System.out.print(" ");
	 	        }
	        
	            for(int col = 0; col < height - row-1; col++)
	            {
	                System.out.print("*");
	            }
	            System.out.println();
	        
	        }
	
	}

	public static void main(String[] args) {
		
		printRhombusFilled(7);
	}

}
	

