package Constructor;

class Car{
	int regNum;
	static int n=1000;
	Car(){
		regNum=n++;
	}
	
	void start() {
		System.out.println("Car Starts with "+regNum);
	}
	void accl() {
		System.out.println("Car Accelerated with "+regNum);
	}
	void brake() {
		System.out.println("car stopped with "+regNum);
	}
}

class Driver{
	Driver(){
		
	}
	Driver(Car c){
		c.start();
		c.accl();
		c.brake();
		
	}
	void driver(Car c) {
		c.start();
		c.accl();
		c.brake();
	}
}

public class Ex8 {

	public static void main(String[] args) {
		Car c1=new Car();
		Car c2=new Car();
		Car c3=new Car();
		new Driver(c3);
		Driver d1=new Driver();
		d1.driver(c1);
		d1.driver(c2);
		d1.driver(c3);
	}

}
