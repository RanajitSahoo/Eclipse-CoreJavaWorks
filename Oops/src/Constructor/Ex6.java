package Constructor;

class C1{
	int i;
	int j;
	C1(int x){
		i=x;
	}
	C1(int x,int y){
		this(x);
		j=y;
	}
}

public class Ex6 {

	public static void main(String[] args) {
		C1 c1=new C1(1);
		C1 c2=new C1(2,3);
		System.out.println(c1.i);
		System.out.println(c1.j);
		System.out.println(c2.i);
		System.out.println(c2.j);

	}

}
