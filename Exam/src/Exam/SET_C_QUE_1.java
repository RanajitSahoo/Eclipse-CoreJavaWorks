//REVERSE HALLO PYRAMID
package Exam;
import java.util.Scanner;
public class SET_C_QUE_1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a size ");
		int n=s.nextInt();
		int star=n;
		int space=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<space;j++) {
				System.out.print(" ");
			}
			for(int j=star;j>=1;j--)
			{
				if(i==1||j==1||j==star)System.out.print("*");
				else System.out.print(" ");
			}
			System.out.println();
			space++;
			star-=2;
		}

	}

}
