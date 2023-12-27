package Object;

class Circle{
	int radius;
}

public class Ex2 {

	public static void main(String[] args) {
		Circle c1=new Circle();
		c1.radius=10;
		System.out.println(c1.radius);
		Circle c2=c1;
		System.out.println(c2.radius);
		c2.radius=20;
		c1.radius=30;
		System.out.println(c2.radius);
		System.out.println(c2.radius);
	}

}
