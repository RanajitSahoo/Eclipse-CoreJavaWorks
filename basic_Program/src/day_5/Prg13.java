package day_5;

public class Prg13 {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				if(i==5/2+1)System.out.print(i+j);
				else System.out.print("*");
			}
			System.out.println();
		}

	}

}
