package raja.mock.Practice;

import java.util.Arrays;

public class Quic {

	public static void main(String[] args) {
		int[] a= {1,3,7,3,9,2,8,4,6,12,0};
		sort(a,0,a.length-1);
		System.out.println(Arrays.toString(a));
	}
	public static void sort(int[] a,int start,int end) {
		if(start>=end)return;
		int pivot=a[(start+end)/2];
		int i=start,j=end;
		while(i<j) {
			while(a[i]<pivot)i++;
			while(a[j]>pivot)j--;
			
				int t=a[i];
				a[i]=a[j];
				a[j]=t;
				i++;
				j--;
			
			sort(a, start, j);
			sort(a, i, end);
		}
	}

}
