package com.jsp.Arraysss;

import java.util.ArrayList;
import java.util.List;

public class Prg8 {

	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		int r = 0, c = -1;
		char dir = 'r';
		int m = matrix.length;
		int n = 0;
		for (int i = 0; i < matrix.length; i++) {
			n = matrix[i].length;
			break;
		}
		int small = matrix[0][0];
		for (int[] t : matrix) {
			for (int num : t) {
				if (small > num)
					small = num;
			}
		}
		small -= 1;
		List<Integer> list = new ArrayList<Integer>();
		System.out.println(m + "" + n);

		for (int i = 0; i < m * n; i++) {

			switch (dir) {
			case 'r':
				c++;

				list.add(matrix[r][c]);
				matrix[r][c] = small;
				if ((c == n - 1 || matrix[r][c + 1] == small)) {
					System.out.println("--");
					dir = 'd';
				}

				break;
			case 'd':
				r++;

				list.add(matrix[r][c]);
				matrix[r][c] = small;
				if ((r == m - 1 || matrix[r + 1][c] == small))
					dir = 'l';
				break;
			case 'l':
				c--;

				list.add(matrix[r][c]);
				matrix[r][c] = small;
				if ((c == 0 || matrix[r][c - 1] == small))
					dir = 'u';
				break;
			case 'u':
				r--;

				list.add(matrix[r][c]);

				matrix[r][c] = small;
				if (matrix[r - 1][c] == small)
					dir = 'r';
				break;

			}

		}
		System.out.println(list);

	}

}
