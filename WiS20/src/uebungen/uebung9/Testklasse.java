package uebungen.uebung9;

public class Testklasse {

	public static void main(String[] args) {
		System.out.printf("%n%n------------------------- Test Pizza ---------------------------%n%n");
		Pizza p1 = new Pizza("Salami", 6.9f);
		Pizza p2 = new Pizza("Margheritha", 5.9f);
		Pizza p3 = new Pizza("Tonno", 6.9f);
		Pizza p4 = new Pizza("Hawaii", 6.9f);
		Pizza p5 = new Pizza("Calzone", 7.9f);
		Pizza p6 = new Pizza("Salami", 6.9f);

		p1.print();
		p2.print();
		p3.print();
		p4.print();
		p5.print();

		System.out.println("p1 gleich p2 ? : " + p1.equals(p2));
		System.out.println("p1 gleich p1 ? : " + p1.equals(p1));
		System.out.println("p1 gleich p6 ? : " + p1.equals(p6));
		System.out.printf("%n%n--------------------- Test Pizzaverkauf ------------------------%n%n");
		Pizzaverkauf pv1 = new Pizzaverkauf(p1);
		pv1.print();
		pv1.verkaufen();
		pv1.print();

	}

}
