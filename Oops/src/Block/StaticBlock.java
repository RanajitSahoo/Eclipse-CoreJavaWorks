package Block;
import java.util.Scanner;
public class StaticBlock {
	static int B;
	static int H;
	static boolean flag=false;
	
	
	static{
		
			Scanner s=new Scanner(System.in);
			System.out.println("Enter the value of B");
			B=s.nextInt();
			System.out.println("Enter the value of H");
			H=s.nextInt();
			if(B<= 0 || H<= 0) {
				System.out.println("Error:java.lang.Exception");
			}
			else {
				flag=true;
			}
		
	}

	public static void main(String[] args) {
		if(flag) {
			int area=B*H;
			System.out.println(area);
		}

	}

}
