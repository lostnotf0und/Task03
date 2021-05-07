package lt.lhu.unit03.main;

import java.util.Random;

public class Task04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar = new int[10];
		Random rand = new Random();

		for (int i = 0; i < ar.length; i++) {
			ar[i] = rand.nextInt(1000);
		}
		System.out.print("массив: ");
		for (int i = 0; i < ar.length; i++) {
			System.out.printf("%4d ", ar[i]);
		}

		int min, temp;
		for (int i = 9; i > 0; i--) {
			min = i;
			for (int j = i - 1; j >= 0; j--) {
				if (ar[j] < ar[min]) {
					min = j;
				}
			}
			temp = ar[i];
			ar[i] = ar[min];
			ar[min] = temp;

		}
		System.out.print("\nотсортированный по убыванию массив: ");
		for (int i = 0; i < ar.length; i++) {
			System.out.printf("%4d ", ar[i]);
		}
		
	}

}
