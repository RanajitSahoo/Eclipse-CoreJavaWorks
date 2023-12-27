package Constructor;

class Bike{
	int regNum;
	String color;
	static int n=1000;
	Bike(String c){
		color=c;
		regNum=n;
		n++;
	}
	void display() {
		System.out.println("Color of the Bike is "+color+", regNum= "+regNum);
	}
}
public class Ex4 {

	public static void main(String[] args) {
		Bike b1=new Bike("Red");
		Bike b2=new Bike("Red");
		b1.display();
		b2.display();

	}

}
