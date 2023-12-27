package IfelseSt;
import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the name and marks");
		String name=scn.nextLine();
		int s1=scn.nextInt();
		int s2=scn.nextInt();
		int s3=scn.nextInt();
		int s4=scn.nextInt();
		int s=s1+s2+s3+s4/4;
		if(s1>=35 && s2>=35 && s3>=35 && s4>=35)
		{
		System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}

		
		
		// TODO Auto-generated method stub

	}

}
