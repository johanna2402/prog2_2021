package aufgaben.aufgabe5;

/**
 * 
 * @author Johanna Lange
 * 
 * In diesen Klassen haben wir ein Dreieck erstellt:
 *
 */

public class Triangle 
{
	private int a;
	private int b;
	private int c;
	
	
	public Triangle(int pa, int pb, int pc)
	{
		a = pa;
		b = pb;
		c = pc;
				
	}
	public int circumference()
	{
		return a+b+c;
	}
	
	public double area() 
	{
		double s = 0.5*(a+b+c);
		double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
		return area;
		
	}
	
	public boolean equilateral() 
	{
		return a==b && a==c && b==c;
	}
	
	public boolean isosceles() 
	{
		return a==b || a==c || b==c;
	}
	
	public boolean sameCircumference(Triangle t) {
		return (t.circumference()== circumference());
	}
	
	public boolean isSmaller(Triangle t) 
	{
		return area()<t.area();
	}
	
	public boolean isBigger(Triangle t) 
	{
		return area() > t.area();
	}
	
	public void print()
	{
		System.out.println("Seiten          : " + "a="+ a + ", " + "b=" + b + ", " + "c=" + c);
		System.out.println("Umfang          : " + circumference());
		System.out.println("Flächeninhalt   : " + area());
		if(equilateral()) {
			System.out.println("Das Dreieck ist gleichseitig.");
			
		}
		else if (isosceles()) {
			
			System.out.println("Das Dreieck ist gleichschenklig.");
		}
		else {
			System.out.println("Das Dreieck ist unregelmäßig.");
		}
		System.out.println();
	}

	
	
	

	
}
