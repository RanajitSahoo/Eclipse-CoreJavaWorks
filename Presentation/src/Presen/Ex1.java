package Presen;

abstract class Bike{
	String color;
			// "Black"
	Bike(String s){
			//"Black"
		color=s;//color=""Black";
	}
	
	 void start() {
		System.out.println("Bike started");
	}
	static void brake() {
		System.out.println("Bike applied brake");
	}
	static void stop() {
		System.out.println("Bike stopped");
	}
	abstract void mileage();
	abstract void avgspeed(); 
	abstract void color(); 
}
class BMW extends Bike{
	 void start() {
		System.out.println("Bike is started");
	}
	static void brake() {
		System.out.println("Bike is applied brake");
	}
	static void stop() {
		System.out.println("Bike is stopped");
	}
	BMW(String s){
		super(s);
	}
	@Override
	void mileage() {
		System.out.println("10kmpl");		
	}

	@Override
	void avgspeed() {
		System.out.println("150kmph");
		
	}

	@Override
	void color() {
		
		System.out.println(color);
		
	}
	
}
class Ktm extends Bike{
			//"Black"
	Ktm(String s){
			//"Black"
		super(s);
	}
	@Override
	void mileage() {
		System.out.println("10kmpl");		
	}

	@Override
	void avgspeed() {
		System.out.println("150kmph");
		
	}

	@Override
	void color() {
							//"Black"
		System.out.println(color);
		
	}
}

class Biker{
	
	void driver(Bike b) {
		b.start();
		b.mileage();
		b.avgspeed();
		b.color();
		b.brake();
		b.stop();
	}
}


public class Ex1 {

	public static void main(String[] args) {
		Biker b1=new Biker();
		b1.driver(new BMW("Black"));

	}

}
