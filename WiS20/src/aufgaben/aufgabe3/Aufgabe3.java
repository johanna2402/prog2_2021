package aufgaben.aufgabe3;

/**
 * 
 * @author Johanna Lange
 * 
 * In dieser Klasse haben wir verschiedene Arrays ausgegeben.
 * 
 * 
 * 
 */

import java.util.Random;

public class Aufgabe3 {

	public static int[] createAndFillArray(int length, int fromInclusive, int toInclusive) {

		int[] a = new int[length];
		Random r = new Random();
		int bound = (toInclusive - fromInclusive) + 1;
		for (int i = 0; i < a.length; i++) {

			if (toInclusive > fromInclusive) {
				a[i] = r.nextInt(bound) + fromInclusive;
			}
		}
		return a;

	}

	public static void printArray(int[] a) {
		System.out.print("[ ");
		for (int index = 0; index < a.length; index++) {

			if (index == a.length - 1) {
				System.out.print(a[index]);
			} else {
				System.out.print(a[index] + ", ");
			}

		}
		System.out.println(" ]");

	}

	public static void printTable(int[] a) {
		System.out.print("| Index :    ");
		for (int index = 0; index < a.length; index++) {
			System.out.printf(" | %5d   ", index);

		}
		System.out.println(" |");

		System.out.print("|-------------");
		for (int index = 0; index < a.length; index++) {
			System.out.printf("|%7s", "----------");

		}
		System.out.println("|");

		System.out.print("| Wert :    ");
		for (int index = 0; index < a.length; index++) {
			System.out.printf("  |%6d  ", a[index]);

		}
		System.out.println("  |");

	}

	public static void printHorizontal(int[] a) {

		for (int index = 0; index < a.length; index++) {
			System.out.printf(" %n   | %n %2d|", index);

			for (int col = 0; col <= a[index]; col++) {

				System.out.print("*");

			}

		}
	}

	public static void main(String[] args) {
		Random r = new Random();
		int length = r.nextInt(10) + 10;
		int[] arr1 = createAndFillArray(length, 20, 30);

		System.out.printf("%n%n%n----------- printArray -----------------%n%n%n");
		printArray(arr1);

		System.out.printf("%n%n%n----------- printTable -----------------%n%n%n");
		printTable(arr1);

		System.out.printf("%n%n%n----------- printHorizontal ------------%n%n%n");
		printHorizontal(arr1);

	}

}
