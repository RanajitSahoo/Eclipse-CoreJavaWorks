package raja.finalmock.Practice;

public class Prg22 {

	public static void main(String[] args) {
		String s1="care";
		String s2="race";
		if(isAnagram(s1,s2))System.out.println("anagram");
		else System.out.println("not Anagram");

	}
	public static boolean isAnagram(String s1,String s2) {
		while(s1.length()==s2.length()) {
			char c=s1.charAt(0);
			s1=s1.replace(c+"", "");
			s2=s2.replace(c+"", "");
			if(s1.length()==0&&s2.length()==0)return true;
		}
		return false;
	}

}
