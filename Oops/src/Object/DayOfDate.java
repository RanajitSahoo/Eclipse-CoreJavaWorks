package Object;
import java.util.Scanner;
class Year{
	
	int code;
	Year(int year){
		int yy=year%100;
		int num=yy/4;
		int add=yy+num;
		int res=add%7;
		code=res;
	}
	
	
}
class Month{
	
	int code;
	Month(int month){
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
		
	}
}
class Century{
	int code;
	Century(int year){
		int cc=year/100;
		if(cc==17||cc==21) {
			code=4;
		}else if(cc==18||cc==22) {
			code=2;
		}else if(cc==19||cc==23) {
			code=0;
		}else if(cc==20) {
			code =6;
		}else {
			System.out.println("Enter a Century between 1700 to 2399");
		}
	}
}

class LeapYear{
	int code;
	LeapYear(int year,int month){
		if((year%4==0&&year%100 !=0)||year%400==0) {
			if(month==1||month==2) {
				code=-1;
			}else {
				code=0;
			}
		}
	}
	
}

class Day{
	int code;
	Day(int day){
		if(day<=31) {
			code=day;
		}
		else {
			System.out.println("Enter a valid day number");
		}
	}
}

class FetchCode{
	 
	static Year year(int year) {
		Year y=new Year(year);
		return y;
	}
	static LeapYear lYear(int year,int month) {
		LeapYear ly=new LeapYear(year, month);
		return ly;
	}
	static Day day(int day) {
		Day d=new Day(day);
		return d;
	}
	static Century century(int year) {
		Century c=new Century(year);
		return c;
	}
	static Month month(int month) {
		Month m=new Month(month);
		return m;
	}
}

class InputDate{
	int yCode;
	int lCode;
	int dCode;
	int cCode;
	int mCode;
	InputDate(Year y,LeapYear l,Day d,Century c,Month m){
		yCode=y.code;
		lCode=l.code;
		dCode=d.code;
		cCode=c.code;
		mCode=m.code;
	}
	
	void display() {
		int res=(yCode+mCode+cCode+dCode-lCode)%7;
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
		}else {
			System.out.println("SaturDay");
		}
	}
	
}
 
class TakeInput{
	static InputDate inputDate() {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your Date to check day");
		System.out.println("----------------------------");
		System.out.println("Enter your Year");
		int y=s.nextInt();
		System.out.println("Enter your Month");
		int m=s.nextInt();
		System.out.println("Enter your Day");
		int d=s.nextInt();
		Year year=FetchCode.year(y);
		LeapYear ly=FetchCode.lYear(y, m);
		Day day=FetchCode.day(d);
		Century c=FetchCode.century(y);
		Month month=FetchCode.month(m);
		InputDate id=new InputDate(year, ly, day, c,month );
		return id;
	}
	
}

public class DayOfDate {

	public static void main(String[] args) {
		
		InputDate i=TakeInput.inputDate();
		i.display();
	}

}
