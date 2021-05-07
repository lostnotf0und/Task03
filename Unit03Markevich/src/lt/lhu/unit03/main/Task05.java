package lt.lhu.unit03.main;

import java.util.Random;

public class Task05 {

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
		System.out.println();
		for (int i = 0; i < ar.length; i++) {
			int temp = ar[i];
			while (i > 0 && ar[i - 1] >= temp) {
				ar[i] = ar[i - 1];
				--i;
			}
			ar[i] = temp;
		}
		System.out.print("отсортированный массив: ");
		for (int i = 0; i < ar.length; i++) {
			System.out.printf("%4d ", ar[i]);
		}
	}

}
