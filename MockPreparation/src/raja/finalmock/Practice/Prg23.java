package raja.finalmock.Practice;

public class Prg23 {

	public static void main(String[] args) {
		String s1="xyz";
		int en=3;
		char[] alp="abcdefghijklmnopqrstuvwxyz".toCharArray();
		char[] arr=s1.toCharArray();
		String s2="";
		for(char c:arr) {
			int index=c-'a';
//			index=-((en%26)-index-26);
			index+=(en%26);
			s2+=alp[index%26];
		}
		System.out.println(s2);

	}

}
