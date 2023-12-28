package pattern;

public class Ex3 {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			if(i==1) {
				for(int j=1;j<=5;j++) {
					int m=i==1||i==9?1:1;
					System.out.print(m);
				}
				for(int j=4;j>=1;j--) {
					int m=i==1||i==9?1:1;
					System.out.print(m);
				}
			}
			if(i==2) {
				for(int j=1;j<=2;j++) {
					
					System.out.print(j);
				}
				for(int k=1;k<=5;k++) {
					System.out.print(i);
				}
				for(int j=2;j>=1;j--) {
					
					System.out.print(j);
				}
			}
			if(i==3) {
				for(int j=1;j<=3;j++) {
					
					System.out.print(j);
				}
				for(int k=1;k<=3;k++) {
					System.out.print(i);
				}
				for(int j=3;j>=1;j--) {
					
					System.out.print(j);
				}
			}
			if(i==4) {
				for(int j=1;j<=4;j++) {
					
					System.out.print(j);
				}
				for(int k=1;k<=1;k++) {
					System.out.print(i);
				}
				for(int j=4;j>=1;j--) {
					
					System.out.print(j);
				}
			}
			if(i==5) {
				for(int j=1;j<=5;j++) {
					System.out.print(j);
				}
				for(int j=4;j>=1;j--) {
					System.out.print(j);
					
				}
			}
			System.out.println();
		}

	}

}
