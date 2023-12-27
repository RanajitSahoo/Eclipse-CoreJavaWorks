package raja.finalmock.Practice;

public class Prg28 {

	public static void main(String[] args) {
		String s1="1jav12a12 is12 e1asy12";
		char[] ch=(s1+" ").toCharArray();
		String num="";
		int sum=0;
		int i=0;
		while(i<ch.length) {
			if(ch[i]>='0'&&ch[i]<='9') {
				num+=ch[i];
			}else {
				if(num!="") {
					sum+=Integer.parseInt(num);
					num="";
				}
			}
			i++;
		}
		System.out.println(sum);

	}

}
