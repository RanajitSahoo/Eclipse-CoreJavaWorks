package raja.finalmock.Practice;

import java.util.Scanner;

class MovieHall{
	private static MovieHall obj;
	private static int seat=50;
	
	private MovieHall() {
		
	}
	
	public static MovieHall getObj() {
		if(obj==null)obj=new MovieHall();
		return obj;
	}
	
	public void RS(int n) {
		if(n>seat)System.out.println("hF");
		System.out.println(n+" s booked");
		seat-=n;
	}
	
}
class TicketBookingApp {
	public static void book() {
		Scanner s=new Scanner(System.in);
//		System.out.println("enter seat");
//		int n=s.nextInt();
		MovieHall m=MovieHall.getObj();
		m.RS(20);
	}
}

public class Prg30 {

	public static void main(String[] args) {
		TicketBookingApp.book();
		TicketBookingApp.book();
		TicketBookingApp.book();
		TicketBookingApp.book();
		TicketBookingApp.book();
		TicketBookingApp.book();
	}

}
