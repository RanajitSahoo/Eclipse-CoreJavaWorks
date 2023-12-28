package textProject;

abstract class Aq{
	private static int a=10;
	Aq(){
		
	}
	static int m1() {
		return a;
	}
	
}
class Bq extends Aq{
	int m() {
		return 0;
	}
}

public class Test1 {

	public static void main(String[] args) {
		Aq a=new Bq();
		
		a.m1();
	}

}
