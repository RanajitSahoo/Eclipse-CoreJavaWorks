package ArrayList;



public class ArrayListTest {

	public static void main(String[] args) {
		ArrayLists a=new ArrayLists();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(80);
		a.add(50);
		a.add(60);
		
		a.add(70);
		System.out.println(a.size());
		for(int i=0;i<a.size();i++) {
			System.out.print(a.get(i)+" ");
		}
		a.remove(a.size());
		
		System.out.println(a.size());
		for(int i=0;i<a.size();i++) {
			System.out.print(a.get(i)+" ");
		}

	}

}
