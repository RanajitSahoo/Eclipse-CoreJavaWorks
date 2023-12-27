package com.jsp.Arraysss;

public class DocNumber {

	public static void main(String[] args) {
		int n=24860;
		int nc=n;
		int d=1;
		while(n>9) {
			d*=10;
			n/=10;
		}
		n=nc;
		int fDigit=n/d;
		int lDigit=n%10;
		if(fDigit!=0&&lDigit!=0) {
			n%=d;
			n/=10;
			int j=n;
			int count=0;
			while(n>0) {
				int rem=n%10;
				if(rem==0)count++;
				n/=10;	
			}
			if(count==1)System.out.println(nc+" is Doc number");
			else System.out.println(nc+" is not a Doc number");
			
		}else {
			System.out.println(nc+" is not a Doc number");
		}
		
		

	}

}
