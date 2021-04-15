package uebungen.uebung9;

public class Speisekarte {

	private Pizza[] angebot;

	public Speisekarte() {
		this.angebot = new Pizza[0];
	}

	public void pizzaHinzufuegen(Pizza pizza) {
		Pizza[] kopie = new Pizza[this.angebot.length + 1];
		for (int index = 0; index < this.angebot.length; index++) {
			kopie[index] = this.angebot[index];
		}
		kopie[kopie.length - 1] = pizza;
		this.angebot = kopie;
	}

	public int getLength() {
		return this.angebot.length;
	}

	public boolean pizzaIstImAngebot(Pizza pizza) {
		for (int index = 0; index < this.angebot.length; index++) {

			if (this.angebot[index].equals(pizza)) {
				return true;
			}

		}
		return false;
	}

	public void pizzaLoeschen(Pizza pizza) {
		
		if(this.pizzaIstImAngebot(pizza)) {
		
			Pizza[] kopie = new Pizza[this.angebot.length -1];
			int kopieIndex = 0;
			for (int indexAngebot = 0; indexAngebot < this.angebot.length; indexAngebot++) {
				if(!this.angebot[indexAngebot].equals(pizza)) {
					kopie[kopieIndex] = this.angebot[indexAngebot];
					kopieIndex ++;
				}
			}
     
			
			this.angebot = kopie;
	}
		
	}

}
