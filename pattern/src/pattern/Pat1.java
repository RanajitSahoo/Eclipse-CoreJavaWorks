package pattern;
import java.util.Scanner;
public class Pat1 {
	static void pat1(int n) {
		int nc=n-1;
		int c=n;
		for(int i=1;i<=n;i++) {
			
			for(int j=1;j<=n;j++) {
				
				if(i<=n/2) {
					if(i+j==n-(n/2-1)||j==n/2+1)System.out.print("*");
					else System.out.print(" ");
					
				}else {
					
					
					if(j==n/2+1)System.out.print("*");
					else System.out.print(" ");
					
					
					
				}
			}
			System.out.println();
		}
	}
	
	static void pat2(int n) {
		
		for(int i=1;i<=n;i++) {
			
			for(int j=1;j<=n;j++) {
				
				if(i<=n/2) {
					if(j==1||i==1||j==n)System.out.print("*");
					else System.out.print(" ");
					
				}else {
					
					
					if(i+j==n+1||i==n||(i==n/2+1 && j>=n/2+1))System.out.print("*");
					else System.out.print(" ");
					
					
					
				}
			}
			System.out.println();
		}
	}
	
static void pat3(int n) {
		
		for(int i=1;i<=n;i++) {
			
			for(int j=1;j<=n;j++) {
				
				
					if(i==1||j==n||(j>=n/2+1&&i==n/2+1)||i==n)System.out.print("*");
					else System.out.print(" ");
					
				
					
					
					
				
			}
			System.out.println();
		}
	}
	
static void pat4(int n) {
	
	for(int i=1;i<=n;i++) {
		
		for(int j=1;j<=n;j++) {
			
			
				
				
			if(i<=n/2) {
				if(j==1||j==n)System.out.print("*");
				else System.out.print(" ");
				
			}else {
				
				
				if(i==n/2+1||j==n)System.out.print("*");
				else System.out.print(" ");
				
				
				
			}
				
				
				
			
		}
		System.out.println();
	}
}
static void pat5(int n) {
	
	for(int i=1;i<=n;i++) {
		
		for(int j=1;j<=n;j++) {
			
			
				
				
			if(i<=n/2) {
				if(j==1||i==1)System.out.print("*");
				else System.out.print(" ");
				
			}else {
				
				
				if(i==n/2+1||j==n||i==n)System.out.print("*");
				else System.out.print(" ");
				
				
				
			}
				
				
				
			
		}
		System.out.println();
	}
}

static void pat6(int n) {
	
	for(int i=1;i<=n;i++) {
		
		for(int j=1;j<=n;j++) {
			
			
				
				
			if(i<=n/2) {
				if(j==1||i==1)System.out.print("*");
				else System.out.print(" ");
				
			}else {
				
				
				if(i==n/2+1||j==n||i==n||j==1)System.out.print("*");
				else System.out.print(" ");
				
				
				
			}
				
				
				
			
		}
		System.out.println();
	}
}
static void pat7(int n) {
	
	for(int i=1;i<=n;i++) {
		
		for(int j=1;j<=n;j++) {
			
				if(i==1||i+j==n+1)System.out.print("*");
				else System.out.print(" ");

		}
		System.out.println();
	}
}
static void pat8(int n) {
	
	for(int i=1;i<=n;i++) {
		
		for(int j=1;j<=n;j++) {
			
				if(i==1||i==n/2+1||j==1||j==n||i==n)System.out.print("*");
				else System.out.print(" ");

		}
		System.out.println();
	}
}
static void pat9(int n) {
	
	for(int i=1;i<=n;i++) {
		
		for(int j=1;j<=n;j++) {
			
			if(i<=n/2) {
				if(j==1||i==1||j==n)System.out.print("*");
				else System.out.print(" ");
				
			}else {
				
				
				if(i==n/2+1||j==n||i==n)System.out.print("*");
				else System.out.print(" ");
				
				
				
			}

		}
		System.out.println();
	}
}

static void pat0(int n) {
	
	for(int i=1;i<=n;i++) {
		
		for(int j=1;j<=n;j++) {
			
				if(i==1||j==1||j==n||i==n)System.out.print("*");
				else System.out.print(" ");

		}
		System.out.println();
	}
}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter size");
		int n=s.nextInt();
		pat0(n);

	}

}
