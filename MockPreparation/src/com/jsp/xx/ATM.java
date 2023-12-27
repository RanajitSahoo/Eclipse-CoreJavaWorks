package com.jsp.xx;

import java.util.Scanner;

public class ATM {

	public static void main(String[] args) {
		while (true) {
			System.out.println("<-------------Raja Banking System-------------->");
			System.out.println("Do you want to Withdraw?");
			System.out.println("press 'yes' or 'YES' for withdraw");
			System.out.println("press 'no' or 'NO' for exit ");
			Scanner s = new Scanner(System.in);
			String choice = s.next();
			switch (choice.toLowerCase()) {
			case "yes":
				int x = 100;
				int y = 500;
				int z = 2000;

				System.out.println("Enter the amount");
				int mon = s.nextInt();

				if (mon > 99 && mon < 25000) {
					int a = 0, b = 0;
					while (mon > 99) {
						if (mon <= 999) {
							System.out.println((r100(mon, x) + (a++)) + " X 100");
							mon = mon % x;
						} else {
							if (mon > 1499) {
								mon -= (5 * x);
								a = 5;
								mon -= (2 * y);
								b = 2;
								if (mon > 2000) {
									System.out.println(r2000(mon, z) + " X 2000");
									mon %= z;
								}
							} else {
								mon -= y;
								System.out.println(++b + " X 500");
							}
						}
					}
					if (a == 5)
						System.out.println(a + " X 100");
					if (b == 2)
						System.out.println(b + " X 500");
				} else {
					if (mon >= 25000)
						System.out.println("couster cant withdraw above 25000 \n your entered amount is " + mon);
					if (mon <= 99)
						System.out.println("couster cant withdraw below 100\n your entered amount is " + mon);
				}

				break;
			case "no":
				System.out.println("exited from atm");
				System.exit(0);
				break;
			default:
				System.out.println("Enter a valid choice");
			}
		}

	}

	public static int r100(int m, int x) {
		return m / x;
	}

	public static int r500(int m, int y) {
		return m / y;
	}

	public static int r2000(int m, int z) {
		return m / z;
	}

}
