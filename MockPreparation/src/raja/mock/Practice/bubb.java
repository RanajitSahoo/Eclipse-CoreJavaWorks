package raja.mock.Practice;

import java.util.Arrays;

public class bubb {

	public static void main(String[] args) {
		int[] a= {1,3,7,3,9,2,8,4,6,12,0};
		sort(a);
		System.out.println(a[2]);
		System.out.println(Arrays.toString(a));

	}
	static public void sort(int[] a) {
		for(int i=0;i<a.length-1;i++) {
			for(int j=0;j<a.length-i-1;j++) {
				if(a[j]<a[j+1]) {
					int t=a[j];
					a[j]=a[j+1];
					a[j+1]=t;
				}
			}
		}
	}

}
