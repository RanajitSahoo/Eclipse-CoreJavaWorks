package day1;

import java.util.Scanner;

public class DeciToBin {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your Binary number");
		int n=s.nextInt();//12
		int sum=0,i=1;// sum=1100  i=10000
		while(n!=0) {
			int rem=n%10;//1%2=1
			sum=sum+(rem*i);//100+(1*1000)
			i *=2;//i=10000
			n /=10;//n=0
		}
		System.out.println(sum);//1100

	}

}
