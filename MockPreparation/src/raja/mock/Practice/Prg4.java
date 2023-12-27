package raja.mock.Practice;

public class Prg4 {

	public static void main(String[] args) {
		String s="Ranajit";
		int i=0;
		while(i<s.length()) {
			char c=s.charAt(0);
			String s2=s.replace(c+"","");
			int cn=s.length()-s2.length();
			System.out.println(c+""+cn);
			s=s2;
		}

	}

}
