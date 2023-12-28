package day_5;

public class Prg16 {

	public static void main(String[] args) {
		int k=1;
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				if(i==5/2+1)System.out.print(k);
				else {
					
					System.out.print("*");
				}
				k++;
			}
			
			System.out.println();
		}
	}

}
