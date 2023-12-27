package raja.finalmock.Practice;

public class Prg35 {

	public static void main(String[] args) {
		int a=0,b=1,c;
		int u=20,l=5;
		while(a<u) {
			if(a>=l)System.out.print(a+" ");
			c=a+b;
			a=b;b=c;
		}

	}

}
