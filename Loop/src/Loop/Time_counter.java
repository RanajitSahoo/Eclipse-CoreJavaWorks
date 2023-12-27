package Loop;
import java.util.Scanner;
public class Time_counter {
	static Scanner s=new Scanner(System.in);
	
	static void swItch() {
		
		char cc=choice();
		switch(cc) {
		case 's':
		case 'S':
			System.out.println("Enter a time in sec");
			int a=s.nextInt();
			sec(a);
			
			
			break;
		case 'm':
		case 'M':
			System.out.println("Enter a time in minutes");
			int b=s.nextInt();
			min(b);
			
			
			break;
		case 'h':
		case 'H':
			System.out.println("Enter a time in hr");
			int d=s.nextInt();
			hr(d);
			
			
			break;
		case 'c':
		case 'C':
			
			
			break;
		case 'e':
		case 'E':
			System.out.println("you are successfully exited");
			
			break;
		default:
			System.out.println("enter a valid charcter");
			
			
				
			
			
		}
		if(cc=='e'||cc=='E') exit();
		else cont();
		
	}
	static void cont() {
		swItch();
	}
	static void exit() {
		while(true) break;
	}
	
	static void sec(int n) {
		if(n<=59)System.out.println(n+" sec");
		if(n>=60) {
			int rest=n%60;
			int s=n/60;
			System.out.println(rest+"sec");
			min(s);

		}
	}
	
    static void min(int n) {
    	if(n<=59)System.out.println(n+" min");
		if(n>=60) {
			int rest=n%60;
			int s=n/60;
			System.out.println(rest+" min");
			hr(s);

		}
		
	}
    static void hr(int n) {
    	
    	if(n<=23)System.out.println(n+" hr");
		if(n>=24) {
			int rest=n%24;
			int s=n/24;
			System.out.println(rest+" hr");
			day(s);

		}
		
	}
static void day(int n) {
    	
    	System.out.println(n+" day");
		

		
		
	}
    
    static char choice() {
    	System.out.println("Enter one of the charcter");
		System.out.println("Enter s for sec");
		System.out.println("Enter m from min");
		System.out.println("Enter h for hour");
		System.out.println("Enter c for continue");
		System.out.println("Enter e for exit");
		
		char c=s.next().charAt(0);
		 return c;
		
    }

	public static void main(String[] args) {
		
		swItch();	
		
	}

}
