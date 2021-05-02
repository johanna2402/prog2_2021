package aufgaben.aufgabe2;

public class MyIntegerMain {

	public static void main(String[] args) {
		
		MyInteger mi1=null,mi2=null;
		
	try {
	 mi1 = new MyInteger("5");
		System.out.println("mi1:"+mi1.intValue());
	}
	catch(IllegalArgumentException e) {
		System.out.println("mi1:" + e.getMessage());
	}
	
	try {
		 mi2 = new MyInteger("5");
		System.out.println("mi2:"+mi2.intValue());
	}
	catch(IllegalArgumentException e) {
		System.out.println("mi2:" + e.getMessage());
	} 
	
	System.out.println("mi1 equals mi2?: " + mi1.equals(mi2));
	
	
  }

}
