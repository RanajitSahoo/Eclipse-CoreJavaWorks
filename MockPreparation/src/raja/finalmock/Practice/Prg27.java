package raja.finalmock.Practice;

public class Prg27 {

	public static void main(String[] args) {
		String s1="java is easy";
		String s2="";
		char[] ch=s1.toCharArray();
		int i=ch.length-1;
		while(i>=0) {
			int j=i;
			while(j>=0&&ch[j]!=' ')j--;
			int k=j+1;
			String t="";
			while(k<=i) {
				t+=ch[k];
				k++;
			}
			j--;
			i=j;
			s2+=t+" ";
		}
		System.out.println(s2);

	}

}
