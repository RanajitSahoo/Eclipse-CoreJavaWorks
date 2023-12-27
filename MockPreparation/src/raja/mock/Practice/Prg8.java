package raja.mock.Practice;

public class Prg8 {

	public static void main(String[] args) {
		String s1="1He123l1l3o3o ";
		
		String num="";
		int sum=0;
		String s2="";
		for(int i=0;i<s1.length();i++) {
			if(s1.charAt(i)>='0'&&s1.charAt(i)<='9') {
				num+=s1.charAt(i);
			}
			else {
				if(num!="") {
//					System.out.println(num.length());

					if(num.length()==1) {
						
						sum+=Integer.parseInt(num);
						
						num="";
					}
					else {
						
						s2+=num;
						num="";
					}
					
				}
			}
		}
		System.out.println(s2+sum);

	}

}
