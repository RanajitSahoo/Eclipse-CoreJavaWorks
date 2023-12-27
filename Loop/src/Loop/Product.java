package Loop;
import java.util.Scanner;
public class Product {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n = s.nextInt();
		String v = "";
		int prd = 1;
		for(int i =1;i<=n;i++) {
			prd *= i;
			v+=i;
			if(i<n)v+="*";
		}
		System.out.println(v+"="+prd);
	}

}
