package raja.mock.Practice;

import java.util.Arrays;

public class SHarr {

	public static void main(String[] args) {
		int[] a= {1,9,7,3,9,2,8,4,6,12};
		int[] b=new int[a.length];
		int k=0;
		Arrays.sort(a);
		for(int i=0;i<a.length-1;i++) {
			if(a[i]!=a[i+1])b[k++]=a[i];
		}
		b[k++]=a[a.length-1];
		int[] c=new int[a.length-1];
		System.arraycopy(b, 0, c, 0, c.length);
		b=c;
		a=b;
		System.out.println(Arrays.toString(a));
		
		System.out.println(a[1]);
	}

}
