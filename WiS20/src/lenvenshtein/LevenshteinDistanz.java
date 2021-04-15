package lenvenshtein;

public class LevenshteinDistanz 
{
	  public int diff(String orig, String eing) {

		    int matrix[][] = new int[orig.length() + 1][eing.length() + 1];
		    for (int i = 0; i < orig.length() + 1; i++) {
		      matrix[i][0] = i;
		    }
		    for (int i = 0; i < eing.length() + 1; i++) {
		      matrix[0][i] = i;
		    }
		    for (int a = 1; a < orig.length() + 1; a++) {
		      for (int b = 1; b < eing.length() + 1; b++) {
		        int right = 0;
		        if (orig.charAt(a - 1) != eing.charAt(b - 1)) {
		          right = 1;
		        }
		        int mini = matrix[a - 1][b] + 1;
		        if (matrix[a][b - 1] + 1 < mini) {
		          mini = matrix[a][b - 1] + 1;
		        }
		        if (matrix[a - 1][b - 1] + right < mini) {
		          mini = matrix[a - 1][b - 1] + right;
		        }
		        matrix[a][b] = mini;
		      }
		    }
		    return matrix[orig.length()][eing.length()];
		  }
}

