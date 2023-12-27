package Constructor;

class D{
	int i;
	int j;
	D(int x){
		i=x;
	}
	D(int x,int y){
//		D d;
		new D(x);
//		i=d.j;
		j=y;
	}
}

public class Ex7 {

	public static void main(String[] args) {
		D d=new D(20,30);
		
		System.out.println(d.i);
		System.out.println(d.j);
	}
	

}
