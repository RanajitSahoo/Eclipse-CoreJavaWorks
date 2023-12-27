package raja.finalmock.Practice;

import java.util.Arrays;

public class Prg9 {

	public static void main(String[] args) {
		int[] a= {1,9,3,0,5,7,2,8,6,4,10};
		sort(a);
		System.out.println(Arrays.toString(a));

	}
	public static void sort(int[] a) {
		for(int i=1;i<a.length;i++) {
			int k=a[i];
			int j=i-1;
			while(j>=0&&a[j]>k) {
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=k;
		}
			
	}

	

}
