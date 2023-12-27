package raja.finalmock.Practice;

import java.util.Arrays;

public class Prg8 {

	public static void main(String[] args) {
		int[] a= {1,9,3,0,5,7,2,8,6,4};
		sort(a);
		System.out.println(Arrays.toString(a));

	}
	public static void sort(int[] a) {
		for(int i=0;i<a.length-1;i++) {
			int index=i;
			for(int j=i+1;j<a.length;j++) {
				if(a[j]<a[index])index=j;
			}
			if(i!=index) {
				int t=a[i];
				a[i]=a[index];
				a[index]=t;
			}
		}
	}

}
