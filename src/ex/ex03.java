package ex;

import java.util.*;

public class ex03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner src = new Scanner(System.in);
		int n = src.nextInt();
		int m = src.nextInt();
		int data[][] = new int[n][m];
		int sum = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				data[i][j] = src.nextInt();
				sum = sum + data[i][j];
			}
		}
		float u = sum / n;
		float ans = fun1(data, n, m, u);
		System.out.println(ans);
		System.out.println(Math.pow(ans, 0.5));

	}

	public static float fun1(int[][] data1, int n1, int m1, float u1) {
		float x = 0;
		int s = n1 * m1;
		for (int i = 0; i < n1; i++) {
			for (int j = 0; j < m1; j++) {
				x = x + (data1[i][j] - u1) * (data1[i][j] - u1) / s;
			}
		}
		return x;
	}

}
