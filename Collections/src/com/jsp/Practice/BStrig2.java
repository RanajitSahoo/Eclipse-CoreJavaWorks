package com.jsp.Practice;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BStrig2 {

	public static void main(String[] args) {
		System.out.println(isBalanced("{[()}]"));

	}
	public static boolean isBalanced(String s) {
		Queue<Character> st=new LinkedList<Character>();
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(c=='{'||c=='('||c=='[')st.add(c);
			else if(c==')'||c=='}'||c==']') {
				if(st.isEmpty()||!pair(st.poll(),c)) {
					return false;
				}
			}
			
		}
		return st.isEmpty();
	}
	public static boolean pair(char c1,char c2) {
		if(c1=='{'||c2=='}')return true;
		if(c1=='['||c2==']')return true;
		if(c1=='('||c2==')')return true;
		return false;
	}
}
