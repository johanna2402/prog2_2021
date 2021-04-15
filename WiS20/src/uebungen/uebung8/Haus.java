package uebungen.uebung8;

import java.util.Random;

public class Haus {

	private Wohnung[] wohnungen;

	public Wohnung neueWohnung() {
		Random r = new Random();
		int qm = r.nextInt(5) * 20 + 20;
		int anzZimmer = r.nextInt(5) + 1;
		int etage = r.nextInt(6);
		double qmMiete = r.nextInt(10) + 0.5 + 8.0;

		return new Wohnung(qm, anzZimmer, etage, qmMiete);
	}

	public Haus(int anzWohnungen) {
		this.wohnungen = new Wohnung[anzWohnungen];
		for (int index = 0; index < this.wohnungen.length; index++) {
			this.wohnungen[index] = this.neueWohnung();
		}
	}
	
	public void print()
	{
		System.out.println("Das Haus besteht aus: ");
		for (int index = 0; index < this.wohnungen.length; index++) {
			this.wohnungen[index].print(); // print methode von wohnung
			
			
		}
	}

}
