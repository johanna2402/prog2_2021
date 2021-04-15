package aufgaben.aufgabe7;
/**
 * 
 * @author Johanna Lange
 * In dieser Klasse haben wir ein Array SAortiert.
 *
 */

public class SortedArray {

	private int[] s;

	public SortedArray() {
		this.s = new int[0];
	}

	public SortedArray(int element) {
		this.s = new int[1];
		this.s[0] = element;
	}

	public void print() {
		
		System.out.print("[ ");
		
		if (this.s.length>0)
		{
			for (int index = 0; index < this.s.length-1; index++)
			{
				System.out.print(this.s[index]+", ");
			}
			System.out.println(this.s[this.s.length -1] + " ]");
		}
		else {
		System.out.println(" ]");
		}

	}
	
	boolean contains(int element) 
	{
		
		for (int index = 0; index < this.s.length; index++) 
		{
			if(this.s[index] == element)
			{
				return true;
			}
		}
		
		return false;

	}

	public boolean insert(int element) 
	{
		if(contains(element))
		{
			return false;
		}
		
		int[] copy = new int[this.s.length +1];
		int sIndex = 0;
		int copyIndex =0;
		while(sIndex < this.s.length && this.s[sIndex] < element )
		{
			copy[copyIndex]=this.s[sIndex];
			copyIndex++;
			sIndex++;
		}
		copy[copyIndex] = element;
		copyIndex++;
		
		while(sIndex < this.s.length) {
			copy[copyIndex]=this.s[sIndex];
			copyIndex++;
			sIndex++;
		}
		this.s = copy;
		
		
		return true;

	}

	public boolean delete(int element) 
	{
		
		if(!contains(element))
		{
			return false;
		}
		
		int[] copy = new int[this.s.length -1];
		int sIndex = 0;
		int copyIndex =0;
		while(sIndex < this.s.length && !(this.s[sIndex] == element) )
		{
			copy[copyIndex]=this.s[sIndex];
			copyIndex++;
			sIndex++;
		}
		sIndex++;
		while(sIndex < this.s.length) {
			copy[copyIndex]=this.s[sIndex];
			copyIndex++;
			sIndex++;
		}
		this.s = copy;
		
		return true;

	}



}
