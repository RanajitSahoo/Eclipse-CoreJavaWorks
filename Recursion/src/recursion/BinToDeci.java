package recursion;

public class BinToDeci {
	
	
	static int bin(int n,int i) {
		if(n<=0) return n*i;
		return n%10*i+bin(n/10,i*2);
	}

	public static void main(String[] args) {
		System.out.println(bin(1111111111,1));

	}

}
