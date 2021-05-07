package lt.lhu.unit03.main;

import java.util.Random;

public class Task03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Random rand = new Random();
		n = rand.nextInt(100) + 10;
		int[] ar = new int[n];

		for (int i = 0; i < ar.length; i++) {
			ar[i] = rand.nextInt(1000);
			if (rand.nextInt(1000) % 3 == 0) {
				ar[i] = -ar[i];
			}
			if (rand.nextInt(1000) % 4 == 0) {
				ar[i] = 0;
			}
		}
		System.out.print("массив из " + n + " элементов: ");
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + " ");
		}

		int minus = 0, plus = 0, nul = 0;
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] < 0) {
				minus++;
			}
			if (ar[i] == 0) {
				nul++;
			}
			if (ar[i] > 0) {
				plus++;
			}
		}
		System.out.println("\nотрицательных элементов: " + minus + " \nнулевых элементов: " + nul
				+ " \nположительных элементов: " + plus);
	}

}
