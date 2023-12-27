package raja.mock.Practice;

import java.util.Arrays;

public class selec {

	public static void main(String[] args) {
		int[] a= {1,3,7,3,9,2,8,4,6,12,0};
		sort(a);
		System.out.println(Arrays.toString(a));
	}
	public static void sort(int[] a) {
		for(int i=0;i<a.length-1;i++) {
			int index=i;
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j])index=j;
			}
			if(i!=index) {
				int t=a[i];
				a[i]=a[index];
				a[index]=t;
			}
		}
	}

}
