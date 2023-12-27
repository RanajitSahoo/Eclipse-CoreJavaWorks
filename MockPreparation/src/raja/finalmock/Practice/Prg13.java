package raja.finalmock.Practice;



public class Prg13 {

	public static void main(String[] args) {
		int[] a= {1,9,3,0,5,7,2,8,6,4};
		System.out.println(sort(a,9));
		

	}
	public static boolean sort(int[] a,int key) {
		for(int i=0;i<a.length;i++) {
			if(key==a[i])return true;
		}
		return false;
	}

}
