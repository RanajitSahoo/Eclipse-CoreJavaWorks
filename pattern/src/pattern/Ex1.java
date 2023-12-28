package pattern;

public class Ex1 {

	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==1||j==1||i==n||j==n) {
					System.out.print(3+" ");
				}
				else {
					
					if(j==n/2+1&&i==n/2+1) {
						System.out.print(1+" ");
					}else if(j<n) {
						System.out.print(2+" ");
					}
					
				}
			}
			System.out.println();
		}

	}

}
