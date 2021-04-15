package skript.mitgehen;

public class Adresse {
	
	
	// --- Objektvariablen -----
	 public String strasse;
	    public int nummer;
	    public int postleitzahl;
	    public String wohnort;
	    
	    // --- Objektmethoden ------
	    public String getAdresse()
	    {
	        return strasse + " " + nummer + " in " + postleitzahl + " " + wohnort;
	    }  

}
