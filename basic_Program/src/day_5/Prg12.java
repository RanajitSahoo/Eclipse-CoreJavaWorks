package day_5;

public class Prg12 {

	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i+j==n+1)System.out.print("*");
				else System.out.print(" ");
			}
			
			for(int j=1;j<=n;j++) {
				if(i==j)System.out.print("*");
				else System.out.print(" ");
			}
			for(int j=1;j<=n;j++) {
				if(i+j==n+1)System.out.print("*");
				else System.out.print(" ");
			}
			
			for(int j=1;j<=n;j++) {
				if(i==j)System.out.print("*");
				else System.out.print(" ");
			}
			
			System.out.println();
			
		}
		
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				
					if(j==i)System.out.print("*");
					else System.out.print(" ");
				
			}
			for(int j=1;j<=n;j++) {
				if(j==n)System.out.print(" ");
				else System.out.print(" ");
			}
			for(int j=1;j<=n;j++) {
				if(j==n)System.out.print(" ");
				else System.out.print(" ");
			}
			
			for(int j=1;j<=n;j++) {
				
					if(i+j==n+1)System.out.print("*");
					else System.out.print(" ");
				
			}
			
			System.out.println();
			
		}
		for(int i=1;i<=n;i++) {
			
			for(int j=1;j<=n;j++) {
				if(j==n)System.out.print(" ");
				else System.out.print(" ");
			}
			for(int j=1;j<=n;j++) {
				
				if(j==i)System.out.print("*");
				else System.out.print(" ");
			
		}
			for(int j=1;j<=n;j++) {
				
				if(i+j==n+1)System.out.print("*");
				else System.out.print(" ");
			
		}
			for(int j=1;j<=n;j++) {
				if(j==n)System.out.print(" ");
				else System.out.print(" ");
			}
			
			
			
			System.out.println();
			
		}
		
		int l=n/2;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i<=l+1) {
					if(i==1||i==n||j==n||j==1||i==l+1) {
						System.out.print("*");
					}
					else System.out.print(" ");
				}else {
					if(j==1||i==j) {
						System.out.print("*");
					}
					else System.out.print(" ");
				}
			}
			System.out.print("   ");
			for(int j=1;j<=n;j++) {
				if(i<=l+1) {
					if(i==1||i==n||j==n||j==1||i==l+1) {
						System.out.print("*");
					}
					else System.out.print(" ");
				}else {
					if(j==1||j==n) {
						System.out.print("*");
					}
					else System.out.print(" ");
				}
			}
			System.out.print("  ");
			for(int j=1;j<=n;j++) {
				if(i>l+1) {
					if(i==1||i==n||j==n||j==1) {
						System.out.print("*");
					}
					else System.out.print(" ");
				}else {
					if(i==1||i==n||j==n) {
						System.out.print("*");
					}
					else System.out.print(" ");
				}
			}
			System.out.print("  ");
			for(int j=1;j<=n;j++) {
				if(i<=l+1) {
					if(i==1||i==n||j==n||j==1||i==l+1) {
						System.out.print("*");
					}
					else System.out.print(" ");
				}else {
					if(j==1||j==n) {
						System.out.print("*");
					}
					else System.out.print(" ");
				}
			}
			System.out.println();
		}
		

	}

}
