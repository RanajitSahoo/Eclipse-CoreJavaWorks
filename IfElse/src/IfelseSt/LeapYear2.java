package IfelseSt;
import java.util.Scanner;

public class LeapYear2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your year here: ");
		int y = s.nextInt();
		if(y%4==0 & y%100 != 0 | y%400==0) {
			
				System.out.println("leap year");
			
		}else {
			System.out.println("not leap year");
		}

	}

}
