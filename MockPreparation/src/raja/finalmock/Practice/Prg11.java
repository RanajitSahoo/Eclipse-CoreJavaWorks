package raja.finalmock.Practice;

import java.util.Arrays;

public class Prg11 {

	public static void main(String[] args) {
		int[] a= {1,9,3,0,5,7,2,8,6,0,4};
		sort(a,0,a.length-1);
		System.out.println(Arrays.toString(a));
	}
	public static void sort(int[] a,int start,int end) {
		if(start>=end)return;
		int pivot=a[(start+end)/2];
		int i=start,j=end;
		while(i<=j) {
			while(a[i]<pivot)i++;
			while(a[j]>pivot)j--;
			if(i<=j) {
				int t=a[i];
				a[i]=a[j];
				a[j]=t;
				i++;j--;
			}
			sort(a, start, j);
			sort(a, i, end);
		}
		
		
		
	}

}
