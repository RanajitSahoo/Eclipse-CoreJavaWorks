package raja.finalmock.Practice;

public class Prg17 {

	public static void main(String[] args) {
		int[][] a=new int[5][];
		for(int i=0;i<a.length;i++) {
			a[i]=new int[i+1];
//			for(int j=i+1;j<a.length;j++) {
//				System.out.print(" ");
//			}
//			for(int j=0;j<a[i].length;j++) {
//				if(j==0||j==i) {
//					a[i][j]=1;
//					System.out.print(a[i][j]+" ");
//				}else {
//					a[i][j]=a[i-1][j]+a[i-1][j-1];
//					System.out.print(a[i][j]+" ");
//				}
//			}
			for(int j=i+1;j<a.length;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<a[i].length;j++) {
				if(j==0||j==i) {
					a[i][j]=1;
					System.out.print(a[i][j]+" ");
				}else {
					a[i][j]=a[i-1][j]+a[i-1][j-1];
					System.out.print(a[i][j]+" ");
				}
			}
			System.out.println();
		}
//		int[][] a=new int[5][];
//		for(int i=0;i<a.length;i++) {
//			a[i]=new int[i+1];
//			for(int j=i+1;j<a.length;j++) {
//				System.out.print(" ");
//			}
//			for(int j=0;j<a[i].length;j++) {
//				if(j==0||j==i) {
//					a[i][j]=1;
//					System.out.print(a[i][j]+" ");
//							
//				}else {
//					a[i][j]=a[i-1][j]+a[i-1][j-1];
//					System.out.print(a[i][j]+" ");
//				}
//			}
//			System.out.println();
//		}

	}

}
