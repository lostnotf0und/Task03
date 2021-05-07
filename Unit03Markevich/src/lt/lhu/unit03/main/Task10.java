package lt.lhu.unit03.main;

import java.util.Random;

public class Task10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Random rand = new Random();
		n = rand.nextInt(20) + 10;
		while (n % 2 == 1) {
			n = rand.nextInt(20) + 10;
		}

		int[][] mas = new int[n][n];
		for (int i = 0; i < mas.length; i++) {
			mas[i][i] = 0;
			mas[i][0] = 1;
			mas[0][i] = 1;
			mas[i][mas.length - 1] = 1;
			mas[mas.length - 1][i] = 1;
		}
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.printf("[%4d]", mas[i][j]);
			}
			System.out.println();
		}
		System.out.println();
	}

}
