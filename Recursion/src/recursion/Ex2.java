
package recursion;

class PrimeN{
	static boolean pri(int n) {
		if(n<=1) return false;
		return div(n,2);
	}
	static boolean div(int n,int i) {
		if(i>n/2) return true;
		if(n%i==0) return false;
		return div(n,i+1);
	}
	 
}

class PrimeM{
	static boolean pri(int n,int i) {
		if(n<=1) return false;
		if(i>n/2) return true;
		if(n%i==0) return false;
		
		return pri(n,i+1);
	}
}

public class Ex2 {

	public static void main(String[] args) {
		System.out.println(PrimeM.pri(2,2));
	}

}
