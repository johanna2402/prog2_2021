package aufgaben.aufgabe6;
/**
 * 
 * @author Johanna Lange 
 * In dieser Aufgabe haben wir mit Brüchen gerechnet.
 *
 */

public class Bruch {
	private int zaehler;
	private int nenner;

	public Bruch() {
		this.zaehler = 1;
		this.nenner = 1;

	}

	public Bruch(int zaehler, int nenner) {
		this.zaehler = zaehler;
		this.nenner = nenner;
	}

	public int ggT(int zahl1, int zahl2) 
	{
		zahl1 = this.zaehler;
		zahl2 = this.nenner;
		int rest;
		while(zahl2 != 0)
		{
			rest = zahl1 % zahl2;
			zahl1 = zahl2;
			zahl2=rest;
					
				
		}
		
		return zahl1;
	}
	
	public String toString() {
		return this.zaehler + "/"+ this.nenner;
	}
	
	public Bruch kuerzen() 
	{
		int ggT=this.ggT(this.zaehler,  this.nenner);
		
		return new Bruch (this.zaehler/ggT, this.nenner/ggT);
	}
	

	public Bruch plus(Bruch b) {
		
		int newNenner= this.nenner*b.nenner;
		int newZaehler=this.zaehler*b.nenner+b.zaehler*this.nenner;
		return new Bruch(newZaehler, newNenner).kuerzen();

	}

	public Bruch minus(Bruch b) {
		
		int newNenner= this.nenner*b.nenner;
		int newZaehler=this.zaehler*b.nenner-b.zaehler*this.nenner;
		return new Bruch(newZaehler, newNenner).kuerzen();

	}

	public Bruch mal(Bruch b) {
		int newNenner= this.nenner*b.nenner;
		int newZaehler=this.zaehler*b.zaehler;
		return new Bruch(newZaehler, newNenner).kuerzen();

	}

	public Bruch geteilt(Bruch b) {
		int newNenner= this.zaehler*b.nenner;
		int newZaehler=this.zaehler*b.nenner;
		return new Bruch(newZaehler, newNenner).kuerzen();

	}
	
	public boolean istGroesser(Bruch b) 
	{
		return this.zaehler*b.nenner > b.zaehler*this.nenner;
	}
	
	public boolean istKleiner(Bruch b) {
		return this.zaehler*b.nenner < b.zaehler*this.nenner;
	}
		
	
	public boolean istGleich(Bruch b) {
		return this.zaehler*b.nenner == b.zaehler*this.nenner;
	}
	

}
