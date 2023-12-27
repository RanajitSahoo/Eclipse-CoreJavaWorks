package raja.mock.Practice;

import java.util.Arrays;

public class Prg13 {

	public static void main(String[] args) {
		int[] a= {1,3,4,5,3,9,9};
		int[] b= new int[a.length];
		sort(a,0,a.length-1);
		int k=0;
		for(int i=0;i<a.length-1;i++) {
			if(a[i]!=a[i+1]) {
				b[k++]=a[i];
			}
		}
		b[k++]=a[a.length-1];
		int c=0;
		for(int n:b) {
			if(n!=0)c++;
		}
		int[] d=new int[c];
		System.arraycopy(b, 0, d, 0, c);
		System.out.println(Arrays.toString(d));

	}
	public static void sort(int[] a,int start,int end) {
		if(start>end)return;
		int mid=(start+end)/2;
		int i=start,j=end;
		while(i<=j) {
			while(a[i]<a[mid])i++;
			while(a[j]>a[mid])j--;
			if(i<=j) {
				int t=a[i];
				a[i]=a[j];
				a[j]=t;
				i++;
				j--;
			}
			sort(a, start, j);
			sort(a, i, end);
		}
		
	}

}
