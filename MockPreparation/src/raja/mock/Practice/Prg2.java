package raja.mock.Practice;

public class Prg2 {

	public static void main(String[] args) {
		String s="Madam";
		if(isPalin(s))System.out.println("palin");
		else System.out.println("not palin");

	}
	public static boolean isPalin(String s) {
		char[] ch=s.toCharArray();
		int i=0,j=ch.length-1;
		while(i<j) {
			if(ch[i]!=ch[j])return false;
			i++;
			j--;
		}
		return true;
	}

}
