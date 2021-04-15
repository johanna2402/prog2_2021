package klausurvorbereitung;

public class Uhrzeit {
	
	private int stunden;
	private int minuten;
	private int sekunden;
	
	public Uhrzeit (int sekunden) {
		
		final int STUNDE = 3600;
		final int MINUTE = 60;
		
		this.stunden = sekunden / STUNDE ;
		this.stunden = this.stunden % 24;
		int restSekunden = sekunden % STUNDE;
		this.minuten = restSekunden / MINUTE;
		restSekunden = restSekunden % MINUTE;
		this.sekunden = restSekunden;
	}
	
	public void print() {
		System.out.println(this.stunden + " : " + this.minuten + " : " + this.sekunden);
	}

}
