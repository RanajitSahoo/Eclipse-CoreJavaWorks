package raja.finalmock.Practice;

public class Prg19 {

	public static void main(String[] args) {
		String s1="madam";
		if(isPalin(s1))System.out.println("palindrome");
		else System.out.println("not palindrome");

	}
	public static boolean isPalin(String s1) {
		int i=0,j=s1.length()-1;
		while(i<j) {
			if(s1.charAt(i)!=s1.charAt(j))return false;
			i++;
			j--;
		}
		return true;
	}

}
