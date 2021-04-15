package gkdi;

public class borriswheeler {

	public static void main(String[] args) {

		String input = "ANANAS.";
		
		char table[][] = new char [input.length()][input.length()];
		
		for(int row =0; row <input.length(); row++)
		{
			for (int column = 0; column < input.length(); column++) 
			{
				int destination = (column + row) % input.length();
				
				
				table[row][destination] = input.charAt(column);
				
			}
		}
		System.out.println(table);

	}

}
