package IfelseSt;

import java.util.Scanner;

public class Markchecking {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your mark");
		int n=s.nextInt();
		int grade=0;
		if(n>=90&&n<=100) {
			grade=1;
		}
		else if(n>=80&&n<=89) {
			grade=2;
		}
		else if(n>=70&&n<=79) {
			grade=3;
		}
		else if(n>=60&&n<=69) {
			grade=4;
		}
		else if(n>=50&&n<=59) {
			grade=5;
		}
		else grade=6;
		switch(grade) {
		case 1:
				System.out.println("grade A");	
				break;
		case 2:System.out.println("grade B");	
		break;
		case 3:System.out.println("grade C");	
		break;
		case 4:System.out.println("grade D");	
		break;
		case 5:System.out.println("grade E");	
		break;
		default:System.out.println("grade F");	
		
		}
	}

}
