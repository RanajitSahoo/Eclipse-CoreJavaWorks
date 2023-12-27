package Inheritance;

import java.util.Scanner;

class GetCode{
	int year;
	int month;
	int day;
	GetCode(int year,int month,int day){
		this.year=year;
		this.month=month;
		this.day=day;
	}
	int centuryCode() {
		int c=1;
		int cc=year/100;
		if(cc==17||cc==21) {
			c= 4;
		}else if(cc==18||cc==22) {
			c= 2;
		}else if(cc==19||cc==23) {
			c= 0;
		}else if(cc==20) {
			c= 6;
		}else {
			System.out.println("Enter a Century between 1700 to 2399");
		}
		return c;
	}
	int yearCode() {
		int yy=year%100;
		int num=yy/4;
		int add=yy+num;
		int code=add%7;
		return code;
	}
	int leapYearCode() {
		int code=0;
		if((year%4==0&&year%100 !=0)||year%400==0) {
			if(month==1||month==2) {
				code=-1;
			}else {
				code=0;
			}
		}
		return code;
	}
	int monthCode() {
		int code=9;
		if(month==1) {
			code=0;
		}
		else if(month==2) {
			code=3;
		}
		else if(month==3) {
			code=3;
		}
		else if(month==4) {
			code=6;
		}
		else if(month==5) {
			code=1;
		}
		else if(month==6) {
			code=4;
		}
		else if(month==7) {
			code=6;
		}
		else if(month==8) {
			code=2;
		}
		else if(month==9) {
			code=5;
		}
		else if(month==10) {
			code=0;
		}
		else if(month==11) {
			code=3;
		}
		else if(month==12) {
			code=5;
		}else {
			System.out.println("Enter a valid month number between 1 to 12");
		}
		return code;
	}
	int dayCode() {
		int code=32;
		if(day>=1&&day<=31) {
			code=day;
		}
		else {
			System.out.println("Enter a valid day number");
		}
		return code;
	}
	
}

class CalculateDay extends GetCode{
	
	CalculateDay(int y,int m,int d) {
		super(y,m,d);
	}
	
	int calculateCode() {
		CalculateDay cd= new CalculateDay(year, month, day);
		int code=9;
		if((year>=1700&&year<=2399)&&(month>=1&&month<=12)&&(day>=1&&day<=31)) {
			int a=cd.centuryCode();
			int b=cd.yearCode();
			int c=cd.monthCode();
			int d=cd.dayCode();
			int e=cd.leapYearCode();
			 code=(a+b+c+d-e)%7;
		}
		
		return code;
	}
	
}
class CheckDayOfDate {
	 
	static void display() {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your Date to check day");
		System.out.println("----------------------------");
		System.out.println("Enter your Year");
		int y=s.nextInt();
		System.out.println("Enter your Month");
		int m=s.nextInt();
		System.out.println("Enter your Day");
		int d=s.nextInt();
		CalculateDay cd= new CalculateDay(y, m, d);
		int res=cd.calculateCode();
		if(res==0) {
			System.out.println("Sunday");
		}else if(res==1) {
			System.out.println("Monday");
		}
		else if(res==2) {
			System.out.println("TuesDay");
		}
		else if(res==3) {
			System.out.println("WednessDay");
		}
		else if(res==4) {
			System.out.println("ThursDay");
		}
		else if(res==5) {
			System.out.println("Friday");
		}else if(res==6) {
			System.out.println("SaturDay");
		}
		else {
			System.out.println("Something Went Wrong Please Check!!!😔");
		}
	}
}

public class DayOfDate {

	public static void main(String[] args) {
		
		
		CheckDayOfDate.display();
		

	}

}
