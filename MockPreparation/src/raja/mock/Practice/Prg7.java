package raja.mock.Practice;

public class Prg7 {

	public static void main(String[] args) {
		String s1="java12 is12 easy12 ";
		char[] ch=s1.toCharArray();
		String num="";
		int sum=0;
		for(int i=0;i<ch.length;i++) {
			if(ch[i]>='0'&& ch[i]<='9') {
				num+=ch[i];
			}
			else {
				if(num!="") {
					sum+=Integer.parseInt(num);
					num="";
				}
			}
		}
		System.out.println(sum);
		

	}

}
