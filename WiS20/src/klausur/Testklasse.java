package klausur;

public class Testklasse {

	public static void main(String[] args) {
		System.out.printf("%n%n------------------ Test Array ------------------%n%n");
		
		MyString s1 = new MyString();
		MyString s2 = new MyString('a');
		MyString s3 = new MyString("hallo");
		
		
		s3.getCharAt(1);
		s3.print();
		s2.print();
		
	System.out.println("a in hallo ?" + s3.contains('a'));
	System.out.println("b in hallo ?" + s3.contains('b'));
		
		MyString s4 = new MyString("hallo");
		MyString s5 = new MyString("halLo");
		
		System.out.println("s3 gleich s4 ? " + s3.equals(s4));
		System.out.println("s3 gleich s5 ? " + s3.equals(s5));
		
		System.out.println("ASCII-Code Zeichen aus s3 mit Index 1 = " + s3.getAscii(1));
		s3.append('c');

}
}