package raja.mock.Practice;

public class Prg6 {

	public static void main(String[] args) {
		String s1="java is esay";
		char[] ch=s1.toCharArray();
		int i=0;
		String st="";
		while(i<ch.length) {
			int j=i;
			while(j<ch.length&&ch[j]!=' ')j++;
			int k=j-1;
			String t="";
			while(k>=i) {
				t+=ch[k];
				k--;
			}
			st+=t+" ";
			j++;
			i=j;
		}
		System.out.println(st);

	}

}
