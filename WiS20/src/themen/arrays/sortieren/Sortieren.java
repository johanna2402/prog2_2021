package themen.arrays.sortieren;

import java.util.Random;

public class Sortieren {
	public static void printArray(int[] a)
    {
        String s = "[ "; 
        for(int index=0; index<a.length-1; index++)
        {
            s = s + a[index] + ", ";
        }
        if(a.length > 0)
        {
            s = s + a[a.length-1] + " ]";
        }
        System.out.println(s);
    }

    /*
     * aus Skript
     */
    public static int[] createAndFillArray(int length, int bound)
    {
        int[] a = new int[length];
        Random r = new Random();                    
        for(int i=0; i<a.length; i++)
        {
            a[i]=r.nextInt(bound);
        }
        return a;
    }

    public static int[] bubblesort(int[] a)
    {
        /*
         * zuerst a nach b kopieren
         */
        int[] b = new int[a.length];
        for (int index = 0; index < b.length; index++)
        {
            b[index] = a[index];
        }

        /*
         * jetzt b sortieren
         * aeussere for-Schleife: Bubble-Phasen
         * innere for-Schleife: Nachbarn vergleichen und eventuell tauschen
         */
        for(int bubble=1; bubble<=b.length-1; bubble++)
        {
            for(int index=0; index<b.length-bubble; index++)
            {
                if(b[index] > b[index+1])
                {
                    int tmp = b[index+1];
                    b[index+1] = b[index];
                    b[index] = tmp;
                }
            }
        }
        return b;
    }

    public static void main(String[] args)
    {
        int[] unsorted = createAndFillArray(20, 50);
        int[] sorted = bubblesort(unsorted);
        printArray(unsorted);
        printArray(sorted);
    }


}
