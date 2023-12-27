package raja.finalmock.Practice;

public class Prg37 {

	public static void main(String[] args) {
		int n=4;
		for(int i=n+1;true;i++) {
			if(isPrime(i)) {
				System.out.println(i);
				break;
			}
		}

	}

	private static boolean isPrime(int i) {
		if(i<=1)return false;
		for(int n=2;n<i/2;n++) {
			if(i%n==0)return false;
		}
		return true;
	}

}
