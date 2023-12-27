package raja.mock.Practice;

public class Prg11 {

	public static void main(String[] args) {
		int n=5;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				System.out.print(" ");
			}
			for(int j=(int)Math.pow(11, i);j>0;j/=10) {
		
				System.out.print(j%10+" ");
			}
			System.out.println();
		}

	}

}
