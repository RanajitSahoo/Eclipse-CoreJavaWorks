package raja.finalmock.Practice;

public class Prg29 {

	public static void main(String[] args) {
		String s1=" i i java is easy";
		char[] a=s1.toCharArray();
		for(int i=0;i<a.length;i++) {
			if(i==0&&a[i]==' ') {
				if(a[i]>='a'&&a[i]<='z') {
					a[i]=(char)(a[i]-32);
				}
				
			}
			if(a[i]==' ') {
				if(a[i+1]>='a'&&a[i+1]<='z') {
					a[i+1]=(char)(a[i+1]-32);
				}
			}
		}
		System.out.println(new String(a));

	}

}
