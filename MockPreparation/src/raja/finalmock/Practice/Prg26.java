package raja.finalmock.Practice;

public class Prg26 {

	public static void main(String[] args) {
		String s1="java is easy";
		String s2="";
		char[] ch=s1.toCharArray();
		int i=0;
		while(i<ch.length) {
			int j=i;
			while(j<ch.length&&ch[j]!=' ')j++;
			int k=j-1;
			String t="";
			while(k>=i) {
				t+=ch[k];
				k--;
			}
			s2+=t+" ";
			j++;
			i=j;
		}
		
		System.out.println(s2);

	}

}
