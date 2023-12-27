package raja.finalmock.Practice;

import java.util.Stack;

public class Prg3 {

	public static void main(String[] args) {
		String s1="{[()]}";
		System.out.println(isBalanced(s1));
	}
//	public static boolean isBalanced(String s) {
//		Stack<Character> st=new Stack<Character>();
//		char[] a=s.toCharArray();
//		for(int i=0;i<a.length;i++) {
//			char c=a[i];
//			if(c=='{'||c=='['||c=='(')st.push(c);
//			else if(c=='}'||c==']'||c==')') {
//				if(st.isEmpty()||!isPair(st.pop(), c))return false;
//			}
//		}
//		return st.isEmpty();
//		
//	}
//	private static boolean isPair(char c1,char c2) {
//		if(c1=='{'&&c2=='}')return true;
//		if(c1=='['&&c2==']')return true;
//		if(c1=='('&&c2==')')return true;
//		return false;
//	}

	private static boolean isBalanced(String s1) {
		Stack<Character> st=new Stack<Character>();
		char[] ch=s1.toCharArray();
		for(int i=0;i<ch.length;i++) {
			char c=ch[i];
			if(c=='{'||c=='('||c=='[')st.add(c);
			else if(c=='}'||c==')'||c==']') {
				if(st.isEmpty()||!pair(st.pop(),c))return false;
			}
		}
		return st.isEmpty();
	}
private static boolean pair(char c1, char c2) {
	if(c1=='{'&&c2=='}')return true;
	if(c1=='['&&c2==']')return true;
	if(c1=='('&&c2==')')return true;
	return false;
}
	

}
