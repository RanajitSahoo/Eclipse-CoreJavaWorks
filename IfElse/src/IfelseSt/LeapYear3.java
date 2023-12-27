package IfelseSt;
import java.util.Scanner;

public class LeapYear3 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("enter your year: ");
		int y = scn.nextInt();
		if(y%400==0) {
			if(y%4==0 & y%100 !=0) {
				
					System.out.println("leap year");
				
			}
		}else {
			System.out.println("not a leap year");
		}
		

	}

}
