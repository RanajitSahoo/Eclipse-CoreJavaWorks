package raja.finalmock.Practice;

public class Prg21 {

	public static void main(String[] args) {
		String s1="abc";
		permute(s1, 0, s1.length());

	}
	public static void permute(String s,int start,int end) {
		if(start==end) {
			System.out.println(s);
			return;
		}
		for(int i=start;i<end;i++) {
			String s1=swap(s,i,start);
			permute(s1, start+1, end);
		}
	}
	public static String swap(String s,int i,int j) {
		char[] ch=s.toCharArray();
		char c=ch[i];
		ch[i]=ch[j];
		ch[j]=c;
		return new String(ch);
	}

}
