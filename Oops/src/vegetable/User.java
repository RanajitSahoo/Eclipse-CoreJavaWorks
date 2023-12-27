package vegetable;

import java.util.Scanner;

public class User {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a vegetable name");
		String vn=s.next();
		Shop shop=new Shop();
		Vegetable v= shop.sell(vn);
			
		if(v instanceof Tomato) {
			((Tomato)v).tomatoCurry();
		}
		else if(v instanceof Potato) {
			((Potato)v).potatoCurry();
		}
		else {
			System.out.println("not available");
		}

	}

}
