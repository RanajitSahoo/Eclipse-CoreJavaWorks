package raja.finalmock.Practice;

public class Prg25 {

	public static void main(String[] args) {
		String s1="banana";
		String s2="";
		char[] ch=s1.toCharArray();
		for(int i=0;i<ch.length-1;i++) {
			if(ch[i]!=' ') {
				
				int count=1;
				for(int j=i+1;j<ch.length;j++) {
					if(ch[i]==ch[j]) {
						count++;
						
						ch[j]=' ';
					}
				}
				s2+=ch[i]+""+count;
			}
			
		}
		System.out.println(s2);

	}

}
