package aufgaben.aufgabe4;
/*
 * @author Johanna Lange
 * 
 * In dieser Aufgabe haben wir ein char Array mit dem Alphabet gefüllt.
 * 
 * 
 */

import java.util.Random;

public class Aufgabe4 {

	public static char[] createAndFillCharArray() {

		char[] alphabet = new char[25];
		Random r = new Random();
		int fromA = 97;
		int toZ = 122;
		int bound = (toZ - fromA) + 1;

		for (int index = 0; index < alphabet.length; index++)

		{
			int randomLetter = r.nextInt(bound) + fromA;

			char c = (char) randomLetter;

			while (contains(alphabet, c)) {
				randomLetter = r.nextInt(bound) + fromA;
				c = (char) randomLetter;
			}
			alphabet[index] = c;

		}

		return alphabet;

	}

	public static boolean contains(char[] ca, char c) {

		for (char element : ca) {
			if (element == c) {
				return true;
			}

		}
		return false;
	}

	public static void print(char[] a) {

		System.out.print("[ ");
		for (int index = 0; index < a.length - 1; index++) {

			System.out.print(a[index] + ", ");

		}
		System.out.println(a[a.length - 1] + " ]");
	}

	public static char[] sort(char[] a) {
		boolean swapped = true;

		for (int bubble = 1; bubble <= a.length - 1 && swapped; bubble++) {
			swapped = false;
			for (int index = 0; index < a.length - bubble; index++) {
				if (a[index] > a[index + 1]) {
					char tmp = a[index + 1];
					a[index + 1] = a[index];
					a[index] = tmp;
					swapped = true;
				}
			}
		}
		return a;
	}

	public static void main(String[] args) {
		for (int asciiValue = 97; asciiValue < 123; asciiValue++) {
			char c = (char) asciiValue;
			System.out.print(c + " ");
		}

		System.out.printf("%n%n----------------- Erzeugen ------------------%n%n");
		char[] ca1 = createAndFillCharArray();
		print(ca1);

		System.out.printf("%n%n----------------- Sortieren ------------------%n%n");
		char[] ca2 = sort(ca1);
		print(ca2);

	}

}