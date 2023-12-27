package override;

class Car{
	
}
class Bmw extends Car{
	
}
class Benz extends Car{
	
}
class Lamb extends Car{
	
}

class Driver{
	void drive(Car c) {
		System.out.println("Car Executed");
	}
}


public class Ex1 {

	public static void main(String[] args) {
		Driver d=new Driver();
		d.drive(new Bmw());
		d.drive(new Benz());
		d.drive(new Lamb());

	}

}
