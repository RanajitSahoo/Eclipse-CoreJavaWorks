package raja.finalmock.Practice;

import java.util.Arrays;

public class Prg31 {

	public static void main(String[] args) {
		int[] a= {1,0,1,2,2,3,3,0,4,4};
		int s=a[0];
		for(int i=1;i<a.length;i++) {
			if(s>a[i])s=a[i];
		}
		s-=1;
		for(int i=0;i<a.length-1;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					a[j]=s;
				}
			}
		}
		int c=0;
		for(int n:a) {
			if(n!=s)c++;
		}
		int[] b=new int[c];
		int k=0;
		for(int n:a) {
			if(n!=s)b[k++]=n;
		}
		System.out.println(Arrays.toString(b));
		
//		for(int i=0;i<a.length-1;i++) {
//			for(int j=i+1;j<a.length;j++) {
//				if(a[i]==a[j])a[j]=-1;
//			}
//		}
//		System.out.println(Arrays.toString(a));
//		int c=0;
//		for(int i=0;i<a.length-1;i++) {
//			if(a[i]!=-1)c++;
//		}
//		int[] b=new int[c];
//		int k=0;
//		for(int i=0;i<a.length;i++) {
//			if(a[i]!=-1)b[k++]=a[i];
//		}
//		System.out.println(Arrays.toString(b));
//		int[] b=new int[a.length];
//		int k=0;
//		for(int i=0;i<a.length-1;i++) {
//			if(a[i]!=a[i+1])b[k++]=a[i];
//		}
//		b[k++]=a[a.length-1];
//		System.out.println(Arrays.toString(b));
//		int c=0;
//		for(int n:b) {
//			if(n!=0)c++;
//		}
//		int[] ca=new int[c];
//		int l=0;
//		for(int i=0;i<ca.length;i++)ca[i]=b[l++];
//		System.out.println(Arrays.toString(ca));
	
	}

}
