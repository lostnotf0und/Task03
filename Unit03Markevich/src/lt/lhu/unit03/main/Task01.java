package lt.lhu.unit03.main;

import java.util.Random;

public class Task01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar = new int[10];
		Random rand = new Random();

		for (int i = 0; i < ar.length; i++) {
			ar[i] = rand.nextInt(1000);
		}

		System.out.printf("Последовательность натуральных чисел: ");

		for (int i = 0; i < ar.length; i++) {
			System.out.printf("%4d ", ar[i]);
		}

		int count = 0;
		for (int i = 0; i < ar.length; i++)
			if (ar[i] % 2 == 0) {
				count++;
			}

		int[] mas = new int[count];

		for (int i = 0, n = 0; i < ar.length; i++) {
			if (ar[i] % 2 == 0) {

				mas[n++] = ar[i];
			}

		}
		System.out.printf("\nПолученный из нее массив: ");
		for (

				int j = 0; j < mas.length; j++) {
			System.out.printf("%4d ", mas[j]);
		}
		System.out.println();
	}
}
