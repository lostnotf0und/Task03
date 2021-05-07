package lt.lhu.unit03.main;

import java.util.Random;

public class Task07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Random rand = new Random();
		n = rand.nextInt(10) + 5;

		int[][] mas = new int[n][n];

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = rand.nextInt(1000);
			}
		}
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.printf("[%4d]", mas[i][j]);
			}

			System.out.println();
		}
		System.out.println("\nЁлементы, сто€щие по диагонали: ");
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j = j + n) {
				System.out.print(mas[i][i] + " ");
			}
		}
	}
}
