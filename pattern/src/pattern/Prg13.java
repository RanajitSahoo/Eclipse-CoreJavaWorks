package pattern;

public class Prg13 {

	public static void main(String[] args) {
		int n=7;
		int star=1;
		int space=n;
		int num=1;
		for(int i=1;i<=n;i++) {
			
			for(int j=1;j<=n;j++) {
				if((i==j||i+j==n+1)&&i!=n/2+1)System.out.print(num);
				if(i==n/2+1&&j==n/2+1) {
					int k=num;
					System.out.print(k*k);
				}
				else System.out.print(" ");
			}
			if(i<=n/2)num++;
			else num--;
			
				
			
			
			System.out.println();
			
		}

	}

}
