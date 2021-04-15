package uebungen.uebung6;

public class Konto {
	
	private double guthaben;
	private int pin;
	private double dispogrenze;
	
	public Konto (int pPin)
	{
		pin = pPin;
		guthaben=0.0;
		dispogrenze = -1000.0;
	}
	
	public void einzahlen(double betrag)
	{
		guthaben = guthaben +betrag;
	
	}

}
