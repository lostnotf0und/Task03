package lt.lhu.unit03.main;

import java.util.Random;

public class Task06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random rand = new Random();

		int[][] ar = new int[10][15];
		int count = 0;
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				ar[i][j] = rand.nextInt(1000);
				if (rand.nextInt(1000) % 3 == 0) {
					ar[i][j] = 7;
					count++;
				}
			}
		}
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				System.out.printf("[%4d]", ar[i][j]);
			}
			System.out.println();
		}
		System.out.println("\nЧисло 7 среди элементов массива встречается " + count + " раз.");

	}
}
