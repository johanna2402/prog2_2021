package klausurII;

public class Testklasse {

	public static void main(String[] args) {
		Triangle t1 = new Triangle(3, 4, 5);
		Triangle t2 = new Triangle(4, 4, 7);
		Triangle t3 = new Triangle(5, 5, 5);
		Triangle t4 = new Triangle(4, 5, 3);
		Triangle t5 = new Triangle(4, 3, 5);
		Triangle t6 = new Triangle(3, 4, 5);

		t1.print();
		t2.print();
		t3.print();
		t4.print();
		t5.print();
		t6.print();
		
		

		System.out.println();
		System.out.println("t1 und t2 gleicher Umfang? : " + t1.sameCircumference(t2));
	    System.out.println("t1 und t3 gleicher Umfang? : " + t1.sameCircumference(t3));
		System.out.println("t2 und t3 gleicher Umfang? : " + t2.sameCircumference(t3));	
		
		
		System.out.println();
		System.out.println("t1 kleiner als t2?         : " + t1.isSmaller(t2));
    	System.out.println("t2 kleiner als t1?         : " + t2.isSmaller(t1));
    	System.out.println("t1 kleiner als t4?         : " + t1.isSmaller(t4));
    	System.out.println("t4 kleiner als t1?         : " + t4.isSmaller(t1));
    	
    	System.out.println();
		System.out.println("t1 größer als t2?          : " + t1.isBigger(t2));
    	System.out.println("t2 größer als t1?          : " + t2.isBigger(t1));
    	System.out.println("t1 größer als t4?          : " + t1.isBigger(t4));
    	System.out.println("t4 größer als t1?          : " + t4.isBigger(t1));

	}
	
}
