package raja.finalmock.Practice;

public class Prg15 {

	public static void main(String[] args) {
		int[][] a = { { 1, 2, 3 },
					  { 4, 5, 6 }, 
					  { 7, 8, 9 } };
		int[][] b = { 
					{ 1, 2, 3 }, 
					{ 4, 5, 6 }, 
					{ 7, 8, 9 } };
		int[][] c = new int[a.length][a.length];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				int sum = 0;
				for (int k = 0; k < a.length; k++) {
					sum += a[i][k] * b[k][j];
				}
				c[i][j] = sum;
			}
		}
		for (int[] t : c) {
			for (int n : t) {
				System.out.print(n + "  ");
			}
			System.out.println();
		}

	}

}
