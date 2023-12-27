package raja.finalmock.Practice;

import java.util.Arrays;

public class Prg12 {

	public static void main(String[] args) {
		int[] a= {1,9,3,0,5,7,2,8,6,4};
		Arrays.sort(a);
		System.out.println(sort(a,0,a.length-1,1));
		

	}
	public static boolean sort(int[] a,int start,int end,int key) {
		if(start>end)return false;
		int mid=(start+end)/2;
		if(a[mid]==key)return true;
		else if(key<a[mid])end=mid-1;
		else start=mid+1;
		return sort(a, start, end, key);
	}

}
