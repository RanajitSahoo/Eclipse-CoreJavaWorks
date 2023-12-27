package raja.mock.Practice;

public class Prg9 {

	public static void main(String[] args) {
		String s="abc";
		permute(s,0,s.length());

	}
	public static  void permute(String s,int start,int end) {
		if(start==end) {
			System.out.println(s);
			return;
		}
		for(int i=start;i<end;i++) {
			String s1=swap(s,start,i);
			
			permute(s1,start+1,end);
		}
		
	}
	public static String swap(String s,int i,int j) {
		char[] a=s.toCharArray();
		char c=a[i];
		a[i]=a[j];
		a[j]=c;
		return new String(a);
	}

}
