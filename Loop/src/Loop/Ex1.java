package Loop;
import java.util.Scanner;
public class Ex1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
        	System.out.println(i);
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int k=1;
            while(i<n) {
            	
            	int sum=0;
                int j=1;
                while(j<=k){
                   sum=sum+(j*b);
                  
                   j*=2; 
                }
                System.out.print((sum+a)+" ");
                k*=2;
                i++;
            }
        }

	}

}
