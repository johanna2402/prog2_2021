package vererbung;

public class Viereck
{
    private int a,b,c,d;            // Seiten

    public Viereck(int a, int b, int c, int d)
    {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public int umfang()
    {
        return this.a + this.b + this.c + this.d;
    }

    public void print()
    {
        System.out.print("[ a=" + this.a + ", b=" + this.b 
                + ", c=" + this.c + ", d=" + this.d + " ] ");
        System.out.println(" Umfang des Vierecks : " + this.umfang());
    }

}
