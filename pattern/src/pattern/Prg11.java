package pattern;

public class Prg11 {

	public static void main(String[] args) {
		int n=7;
		int star=1;
		int space=n;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<space;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=star;j++) {
//				if(i==n/2+1&&j==n/2+1)System.out.print("*");
				if(j==1||j==star)System.out.print("*");
				else System.out.print(" ");
			}
			if(i<=n/2) {
				space--;
				star+=2;
			}else {
				space++;
				star-=2;
			}
			System.out.println();
			
		}

	}

}
