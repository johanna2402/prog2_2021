package test1;

public class Test1 {

	

public static void printRhombus (int upperHalf, boolean filled) {
			
			int height = 2 * upperHalf +1; 
		

			        for(int row=0; row<height*2; row++)
			        {
			            for(int spaces = 1; spaces < height; spaces++)
			            {
			            	
			            	if (spaces < height - row)
			            	{
			            		System.out.print(" ");	
			            	}
			            	else
			            	{
			            		if(spaces > row - height)
			            		{
			            			System.out.print(" ");
			            		}
			            	}
			            	
			                
			            }
			            for(int col = 0; col <= row + row ;col ++)
			            {
			            	if (col <= height + row)
			            	{
			            		System.out.print("*");	
			            	}
			            	else
			            	{
			            		if(col > height-row)
			            		{
			            			System.out.print("*");
			            		}
			            	}
			            	
			            	
			            	
			            	 
			            }
			           
			        
			            System.out.println();
			        }
			        
			        }



			
			       
			    	    
	public static void main(String[] args) {
			
			printRhombus(2,true);
			
			for(int w=0; w < 10; w++) {
			
				
				for(int x=0; x<10;x++) {
					
					
					for(int y = 0; y<10;y++)
					{
						
					
					   for(int z = 0; z<10;z++)
					   {
						System.out.println(String.valueOf(w)+String.valueOf(x)+String.valueOf(y)+String.valueOf(z));
					   }
					}
					
					
				}
			  }
			}
			
		}
	
		

		



	
	
	
	
	
	
	
	


