package raja.finalmock.Practice;

public class Prg16 {

	public static void main(String[] args) {
		int size = 5;
		int[][] a = new int[size][size];
		int r = 0, c = -1;
		char dir = 'r';
		for (int i = 1; i <= size * size; i++) {
			switch (dir) {
			case 'r':
				c++;
				a[r][c] = i;
				if (c == size - 1 || a[r][c + 1] != 0)
					dir = 'd';
				break;
			case 'd':
				r++;
				a[r][c] = i;
				if (r == size - 1 || a[r + 1][c] != 0)
					dir = 'l';
				break;
			case 'l':
				c--;
				a[r][c] = i;
				if (c == 0 || a[r][c - 1] != 0)
					dir = 'u';
				break;
			case 'u':
				r--;
				a[r][c] = i;
				if (a[r - 1][c] != 0)
					dir = 'r';
				break;
			}
		}

		for (int[] t : a) {
			for (int n : t) {
				System.out.print(n + "\t");
			}
			System.out.println();
		}

	}

}
