package uebungen.uebung8;

public class Wohnung {
	
	private int qm;
	private int anzZimmer;
	private int etage;
	private double qmMiete;
	
	
	public Wohnung(int qm, int anzZimmer, int etage, double qmMiete) {
		
		this.qm = qm;
		this.anzZimmer = anzZimmer;
		this.etage = etage;
		this.qmMiete = qmMiete;
	}


	public int getQm() {
		
		return this.qm;
	}


	public int getAnzZimmer() {
		
		return this.anzZimmer;
	}


	public int getEtage() {
		
		return this.etage;
	}


	public double getQmMiete() {
		
		return this.qmMiete;
	}
	
	public double gesamtMiete()
	{
		return qm * qmMiete;
	}
	
	public boolean billiger (Wohnung w)
	{
		return this.qm * this.qmMiete < w.qm * w.qmMiete; 
	}
	
	public boolean teurer (Wohnung w) 
	{
		return this.qm * this.qmMiete > w.qm * w.qmMiete;
	}


	
	public String toString() {
		
		if(etage == 0) {
		
			return anzZimmer+"-Zimmer Wohnung mit " + qm + " qm im Erdgeschoss. Monatliche Miete: " + gesamtMiete() + "0 Euro";
		}
		
	if (etage == 5)
	{
		
		return anzZimmer+"-Zimmer DG-Wohnung mit " + qm + " qm in der " + etage +". Etage. Monatliche Miete: " + gesamtMiete() + "0 Euro";
		
	}
		
		else {
			return anzZimmer+"-Zimmer Wohnung mit " + qm + " qm in der " + etage + ". Etage. Monatliche Miete: " + gesamtMiete() + "0 Euro";
		}
		
	
	}
		
	
	public void print()
	{
		System.out.println(this.toString());
	}
	
	
	
	
	
	
	

}
