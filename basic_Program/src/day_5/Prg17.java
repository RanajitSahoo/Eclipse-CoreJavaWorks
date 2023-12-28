package day_5;

public class Prg17 {

	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++) {
			int k=4;
			for(int j=1;j<=i;j++) {
				
				if(i==5/2+1) {
					
					System.out.print(k++);
					
				}
				else {
					
					System.out.print("*");
				}
				
			}
			
			System.out.println();
		}

	}

}
