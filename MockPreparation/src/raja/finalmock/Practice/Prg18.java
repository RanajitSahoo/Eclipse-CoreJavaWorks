package raja.finalmock.Practice;

public class Prg18 {

	public static void main(String[] args) {
		String s1="ranajit";
		String s2=rev(s1);
		System.out.println(s2);

	}
	public static String rev(String s1) {
		char[] ch=s1.toCharArray();
		int i=0,j=ch.length-1;
		while(i<j) {
			char c=ch[i];
			ch[i]=ch[j];
			ch[j]=c;
			i++;
			j--;
		}
		return new String(ch);
		
	}

}
