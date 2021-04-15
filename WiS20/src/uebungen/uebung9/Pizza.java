package uebungen.uebung9;

public class Pizza {

	private String name;
	private float preis;

	public Pizza(String name, float preis) {

		this.name = name;
		this.preis = preis;
	}

	public String getName() {

		return this.name;
	}

	public float getPreis() {
		return this.preis;
	}

	@Override
	public String toString() {
		return "Die Pizza " + name + " kostet " + preis + "0 Euro.";
	}
	 public void print() {
		System.out.println(this.toString());
	 }
	@Override
	 public boolean equals(Object o){
		 if (o == null) return false;
		 if (this==o) return true;
		 if (this.getClass()!=o.getClass()) return false;
		 
		 Pizza po = (Pizza)o;
		 return (this.name.equals(po.name));
	 }
	

}
