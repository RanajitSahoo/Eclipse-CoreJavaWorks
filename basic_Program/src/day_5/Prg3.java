package day_5;

public class Prg3 {

	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==j) {
					System.out.print(i);
				}
				else {
					System.out.print("*");
				}
			}
			System.out.println();
		}

	}

}