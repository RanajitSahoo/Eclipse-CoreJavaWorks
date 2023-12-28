package day_1;

import java.util.Scanner;
//sum of even and odd digits
public class Prg3 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int sume=0,sumo=0;
		while(n>0) {
			int d=n%10;
			if(d%2==0)sume+=d;
			else sumo+=d;
			n/=10;
		}
		System.out.println("sum of even digits is "+ sume);
		System.out.println("sum of odd digits is "+ sumo);

	}

}
