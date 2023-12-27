package Loop;

public class Hollow {

	public static void main(String[] args) {
		int n=5;
		int star=n;
		int space=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=star;j++) {
				System.out.print("*");
			}
			for(int j=1;j<=space;j++) {
				System.out.print(" ");
			}
			
			for(int j=1;j<=star;j++) {
				System.out.print("*");
			}
			if(i<=n/2) {
				star--;
				space+=2;
			}else {
				star++;
				space-=2;
				
			} 
			System.out.println();
			
		}

	}

}
