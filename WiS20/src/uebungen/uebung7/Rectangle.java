package uebungen.uebung7;

public class Rectangle 
{
	private int a;
	private int b;
	
	public Rectangle() {
		this.a = 10;
		this.b=20;
	}
	
	public Rectangle(int a, int b)
	{
		this.a = a;
		this.b = b;
	}
	public int area()
	{
		return this.a * this.b;
	}
	
	public int perimeter()
	{
		return 2 * (this.a + this.b);
	}
	public String toString()
	{
		String s = String.format("Rectangle : a=%2d, b=%2d, area=3%d, perimeter=%2d)",
				this.a,this.b,this.area(),this.perimeter());
		return s;
	}
	public void print()
	{
		System.out.println(this.toString());
	}
	public boolean sidesAreEqual(Rectangle r)
	{
		return (this.a ==r.a && this.b ==r.b) ||
				(this.a ==r.b && this.b == r.a);
				
	}
	public boolean areasAreEqual(Rectangle r)
	{
		return (this.area() == r.area());
				
	}
	public boolean perimetersAreEqual(Rectangle r)
	{
		return (this.perimeter() == r.perimeter());
				
	}
	public void printComparison(Rectangle r)
	{
		System.out.print("this ");
		this.print();
		System.out.print("the other ");
		r.print();
		
		if (this.sidesAreEqual(r))
		{
			System.out.println("sides are equal");
		}
		else {
			System.out.println("sides are not equal");
		}
		if (this.areasAreEqual(r))
		{
			System.out.println("areas are equal");
		}
		else {
			System.out.println("areas are not equal");
		}
		if (this.perimetersAreEqual(r))
		{
			System.out.println("perimeters are equal");
		}
		else {
			System.out.println("perimeters are not equal");
		}
	
	}
	
	public Rectangle doubleSides()
	{
		int newA = this.a *2;
		int newB = this.b *2;
		Rectangle newRec = new Rectangle(newA,newB);
		return newRec;
		
	}
	
	
	

}
