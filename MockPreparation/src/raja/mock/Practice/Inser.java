package raja.mock.Practice;

import java.util.Arrays;

public class Inser {

	public static void main(String[] args) {
		int[] a= {1,3,7,3,9,2,8,4,6,12,0};
		sort(a);
		System.out.println(Arrays.toString(a));

	}
	public static void sort(int[] a) {
		for(int i=1;i<a.length;i++) {
			int k=a[i];
			int j=i-1;
			while(j>=0&&a[j]<k) {
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=k;
		}
	}

}
