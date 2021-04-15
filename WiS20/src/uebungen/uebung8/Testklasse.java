package uebungen.uebung8;

public class Testklasse {

	public static void main(String[] args) {
		
		System.out.printf("%n%n--------------------- Test Wohnung -------------------------%n%n");
		Wohnung w1 = new Wohnung(70, 3, 4, 12.50);
		Wohnung w2 = new Wohnung(40, 1, 0, 9.50);
		Wohnung w3 = new Wohnung(90, 4, 2, 11.10);
		Wohnung w4 = new Wohnung(60, 2, 0, 9.00);

		w1.print();
		w2.print();
		w3.print();
		w4.print();
		
		
		System.out.printf("%n%n--------------- Test Dachgeschosswohnung -------------------%n%n");
		Dachgeschosswohnung dg1 = new Dachgeschosswohnung(70, 3, 15.50);
		Dachgeschosswohnung dg2 = new Dachgeschosswohnung(100, 4, 17.25);

		dg1.print();
		dg2.print();
		
		System.out.printf("%n%n---------------------- Test Haus ---------------------------%n%n");
		Haus h1 = new Haus(10);
		h1.print();

	}

}
