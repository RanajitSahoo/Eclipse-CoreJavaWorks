package Constructor;

class Box{
	int height;
	int length;
	int width;
	Box(){
		
	}
	Box(int d){
		height=length=width=d;
	}
	Box(int height,int length,int width){
		this.height=height;
		this.length=length;
		this.width=width;
	}
	Box(Box b)
	{
		this(b.height,b.length,b.width);
	}
	void display() {
		System.out.println("["+height+","+length+","+width+"]");
	}
}

public class Ex5 {

	public static void main(String[] args) {
		Box b1=new Box();
		Box b2=new Box(5);
		Box b3=new Box(1,2,3);
		Box b4=new Box(b2);
		b1.display();
		b2.display();
		b3.display();
		b4.display();

	}

}
