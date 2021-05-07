package lt.lhu.unit03.main;

import java.util.Random;

public class Task02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar = new int[10];
		Random rand = new Random();

		for (int i = 0; i < ar.length; i++) {
			ar[i] = rand.nextInt(1000);
		}
		System.out.printf("Последовательность чисел: ");

		for (int i = 0; i < ar.length; i++) {
			System.out.printf("%4d ", ar[i]);
		}
		System.out.println();

		int min, temp;

		for (int j = 0; j < ar.length - 1; j++) {
			min = j;
			for (int n = j + 1; n < ar.length; n++) {
				if (ar[n] < ar[min]) {
					min = n;

				}
			}

			temp = ar[j];
			ar[j] = ar[min];
			ar[min] = temp;
		}
		int dif = ar[9] - ar[0];

		System.out.println("Минимальная длина оси, содержащей эти числа = " + dif);

	}
}
