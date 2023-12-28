package recursion;

public class DeciToBinary {
	
	static int deci(int n,int i) {
		if(n==0) return n*i;
		

		return ((n%2)*i)+deci(n/2,i*10);
		
		
	}

	public static void main(String[] args) {
		
			System.out.println(deci(11,1));
	}

}
