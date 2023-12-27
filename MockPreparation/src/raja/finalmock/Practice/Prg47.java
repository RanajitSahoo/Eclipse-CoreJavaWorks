package raja.finalmock.Practice;

public class Prg47 {

	public static void main(String[] args) {
		System.out.println(prime(5,2));

	}
	public static boolean prime(int n,int i) {
		if(n<=1)return false;
		if(i>n/2)return true;
		if(n%i==0)return false;
		return prime(n,i+1);
	}

}
