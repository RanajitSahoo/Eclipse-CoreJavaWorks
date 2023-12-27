package raja.finalmock.Practice;

public class Prg41 {

	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++) {
			if(i%2==0) {
				for(int j=n*i;j>=n*i-n+1;j--) {
					System.out.print(j);
				}
			}
			else {
				for(int j=n*i-n+1;j<=n*i;j++) {
					System.out.print(j);
				}
			}
			System.out.println();
			
		}

	}

}
