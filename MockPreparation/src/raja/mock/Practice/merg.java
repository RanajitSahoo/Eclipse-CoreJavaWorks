package raja.mock.Practice;

import java.util.Arrays;

public class merg {

	public static void main(String[] args) {
		int[] a= {1,3,7,3,9,2,8,4,6,12,0};
		sort(a);
		System.out.println(Arrays.toString(a));

	}
	public static void sort(int[] a) {
		if(a.length==1)return ;
		int[] left=new int[a.length/2];
		int[] right=new int[a.length-left.length];
		int i=0;
		for(int j=i;j<left.length;j++) {
			left[j]=a[i++];
		}
		for(int j=0;j<right.length;j++) {
			right[j]=a[i++];
		}
		sort(left);
		sort(right);
		merge(left,right,a);
	}
	public static void merge(int[] left,int[] right,int[] a) {
		int i=0,j=0,k=0;
		while(i<left.length&&j<right.length) {
			if(left[i]<right[j])a[k++]=left[i++];
			else a[k++]=right[j++];
		}
		while(i<left.length)a[k++]=left[i++];
		while(j<right.length)a[k++]=right[j++];
	}

}
