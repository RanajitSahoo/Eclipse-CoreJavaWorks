package raja.finalmock.Practice;

import java.util.Arrays;

public class Prg7 {

	public static void main(String[] args) {
		int[] a= {1,9,3,0,5,7,2,8,6,4};
		sort(a);
		System.out.println(Arrays.toString(a));

	}
	public static void sort(int[] a) {
		for(int i=0;i<a.length-1;i++) {
			for(int j=0;j<a.length-i-1;j++) {
				if(a[j]>a[j+1]) {
					int t=a[j];
					a[j]=a[j+1];
					a[j+1]=t;
				}
			}
		}
	}

}
