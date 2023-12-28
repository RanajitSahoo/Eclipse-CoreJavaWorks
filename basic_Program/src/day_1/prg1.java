package day_1;
import java.util.Scanner;
//WAP to display count the digit of a given number
public class prg1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int t=n;
		int c=0;
		while(n>0){
			c++;
			n/=10;
		}
		System.out.println("number of didgit in "+t+" is "+c);
		
	}

}
