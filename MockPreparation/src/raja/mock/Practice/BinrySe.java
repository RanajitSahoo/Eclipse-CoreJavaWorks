package raja.mock.Practice;

public class BinrySe {

	public static void main(String[] args) {
		int[] a= {1,7,3,9,2,8,4,6,12,0};
		if(search(a,12,0,a.length-1))System.out.println("true");
		else System.out.println("fLSE");

	}
	public static boolean search(int[] a,int key,int start,int end) {
		if(start>end)return false;
		int mid=(start+end)/2;
//		int i=start,j=end;
		if(key==a[mid])return true;
		if(key<a[mid])end=mid-1;
		else start=mid+1;
		return search(a, key, start, end);
	}

}
