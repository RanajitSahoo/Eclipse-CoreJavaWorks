package raja.mock.Practice;

public class Prg1 {

	public static void main(String[] args) {
		String s="Ranajit";
		System.out.println(reverse(s));

	}
	public static String reverse(String s) {
		char[] ch=s.toCharArray();
		int i=0,j=ch.length-1;
		while(i<j) {
			char t=ch[i];
			ch[i]=ch[j];
			ch[j]=t;
			i++;
			j--;
		}
		return new String(ch);
	}

}
