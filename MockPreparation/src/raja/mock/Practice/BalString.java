package raja.mock.Practice;

import java.util.Stack;

public class BalString {

	public static void main(String[] args) {
		String s1="{[()]}";
		System.out.println(isBalanced(s1));

	}
	public static boolean isBalanced(String s) {
		Stack<Character> st=new Stack<Character>();
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(c=='{'||c=='('||c=='[')st.push(c);
			else if(c=='}'||c==')'||c==']') {
					if(st.isEmpty()||!isPair(st.pop(),c)) {
						return false;
					}
			}
			
		}
		return st.isEmpty();
	}
	public static boolean isPair(char c1,char c2) {
		if(c1=='{'&&c2=='}')return true;
		if(c1=='['&&c2==']')return true;
		if(c1=='('&&c2==')')return true;
		return true;
	}

}
