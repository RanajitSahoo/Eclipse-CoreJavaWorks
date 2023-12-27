package Presen;

public class S1 {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++)
		{
			
			for(int j=1;j<=5;j++)
			{
				int a=3;
				if(i==1 || j==1 || i==5 || j==5)
				{
					
					a-=2;
					System.out.print(a);
					
				}
				else if(i==2 || j==2 || i==4 || j==4)
				{
					a-=1;
					System.out.print(a);
				}
				else
				{
					
					System.out.print(a);
				}
				
				
			}
			
			System.out.println();
		}

	}

}
