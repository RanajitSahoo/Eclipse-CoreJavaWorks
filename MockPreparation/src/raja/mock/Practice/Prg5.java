package raja.mock.Practice;

public class Prg5 {

	public static void main(String[] args) {
		String s="Ranajit";
		char[] ch=s.toCharArray();
		for(int i=0;i<ch.length-1;i++) {
			int cn=1;
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]==ch[j]) {
					cn++;
					
				}
			}
			System.out.println(ch[i]+""+cn);
		}

	}

}
