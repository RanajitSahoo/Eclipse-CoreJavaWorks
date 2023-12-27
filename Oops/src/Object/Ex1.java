package Object;


class Ac{
	int temp=24;
	boolean power=false;
	
	
		
	
	
	void powerSwitch() {
		if(power) {
			power=false;
			System.out.println("Ac is off now");
		}else {
			power=true;
			System.out.println("Ac is on now");
		}
	}

	void incTemp() {
		if(power) {
			temp++;
			if(temp==35) {
				System.out.println("temp increased to "+temp+" itʼs too hot please decrease temp ");
				return;
			}
			System.out.println("temp increased to "+temp);
		}else {
			System.out.println("Ac is off.. ");
			System.out.println("please turn on the Ac then increase temp ");
		}
		
	}
	void decTemp() {
		if(power) {
			temp--;
			if(temp==16) {
				System.out.println("temp decreased to "+temp+" itʼs too cold please increase temp ");
				return;
			}
			System.out.println("temp decreased to "+temp);
		}else {
			System.out.println("Ac is off.. ");
			System.out.println("please turn on the Ac then decrease temp ");
		}
		
	}
}

public class Ex1 {

	public static void main(String[] args) {
		Ac a1=new Ac();
		a1.powerSwitch();
		a1.incTemp();
		a1.decTemp();
		a1.powerSwitch();
		a1.incTemp();
		a1.decTemp();
		a1.powerSwitch();
		a1.incTemp();
		a1.decTemp();
		a1.powerSwitch();
		a1.powerSwitch();
		

	}

}
