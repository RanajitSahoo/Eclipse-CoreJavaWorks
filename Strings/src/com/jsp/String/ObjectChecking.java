package com.jsp.String;

public class ObjectChecking {

	public static void main(String[] args) {
//		it is creating memory in heap area
		System.out.println("heap area");
		System.out.println("-----------------------------");
		String s1=new String("Raja");
		String s2=new String("Raja");
		System.out.println(s1==s2);//it is checking the Object reference of the ref variable
		System.out.println(s1.equals(s2));//it is checking the value of the object
		
		System.out.println("SCP  area");
		System.out.println("-----------------------------");
		//it is creating memory in SCP(String Constant Pool) which is present inside heap area
		String s3="Raja";
		String s4="Raja";
		System.out.println(s3==s4);//it is checking the Object reference of the ref variable
		System.out.println(s3.equals(s4));//it is checking the value of the object


	}

}
