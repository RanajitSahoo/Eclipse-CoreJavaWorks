package Object;

class  Any{
	int rad;
	void initialize1(int rad) {
		rad=rad;
	}
	void initialize2(int rad) {
		this.rad=rad;
	}
	void display() {
		System.out.println(rad);
	}
}

public class Ex4 {

	public static void main(String[] args) {
		Any c=new Any();
		c.initialize1(10);
		c.display();
		c.initialize2(10);
		c.display();
		

	}

}
