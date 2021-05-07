package lt.lhu.unit03.main;

import java.util.Random;
import java.util.Scanner;

public class Task08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, m;
		Random rand = new Random();
		n = rand.nextInt(10) + 5;
		m = rand.nextInt(10) + 5;
		int[][] mas = new int[n][m];

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
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Вывести строку: ");
		int a = sc.nextInt();
		
		while (a > mas.length) {
			System.out.print("В матрице отсутствует строка " + a + ". Вывести строку: "); 
			a = sc.nextInt();
			
		}

		System.out.print("Вывести столбец: ");
		int b = sc.nextInt();

		while (b > mas[0].length) {
			System.out.print("В матрице отсутствует столбец " + b + ". Вывести столбец: ");
			b = sc.nextInt();
		}

		System.out.println("\nСтрока " + a + ":");

		for (int j = 0; j < mas[a - 1].length; j++) {
			System.out.printf("[%4d]", mas[a - 1][j]);
		}
		System.out.print("\n\nСтолбец " + b + ": ");

		for (int i = 0; i < mas.length; i++) {

			System.out.printf("\n[%4d]", mas[i][b - 1]);

		}
	}
}
