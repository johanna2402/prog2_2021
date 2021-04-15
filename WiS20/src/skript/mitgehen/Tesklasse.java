package skript.mitgehen;

public class Tesklasse {

	public static void main(String[] args) {

		Adresse adresse1 = new Adresse(); // erstes Objekt erzeugt
		Adresse adresse2 = new Adresse(); // zweites Objekt erzeugt
		
		   adresse1.strasse = "Wilhelminenhofstr.";
	        adresse1.nummer = 75;
	        adresse1.postleitzahl = 12459;
	        adresse1.wohnort = "Berlin";

	        adresse2.strasse = "Treskowallee";
	        adresse2.nummer = 8;
	        adresse2.postleitzahl = 10318;
	        adresse2.wohnort = "Berlin";

	        System.out.println(adresse1.getAdresse());
	        System.out.println(adresse2.getAdresse());
	        

	}

}
