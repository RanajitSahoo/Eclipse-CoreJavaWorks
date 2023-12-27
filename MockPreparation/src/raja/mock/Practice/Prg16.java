package raja.mock.Practice;
class ArrayList{
	private Object[] a=new Object[5];
	private int p;
	
	public void add(int ele) {
		if(p>=a.length)increase();
		a[p++]=ele;
	}
	private void increase() {
		Object[] temp=new Object[a.length+3];
		System.arraycopy(a, 0, temp, 0, a.length);
		a=temp;
	}
	public int size() {
		return p;
		
	}
	public Object get(int index) {
		if(index<=-1||index>=size())throw new IndexOutOfBoundsException();
		return a[index];
	}
	public void add(int ele,int index) {
		for(int i=size()-1;i>=index;i--) {
			a[i+1]=a[i];
		}
		a[index]=ele;
		p++;
	}
	public void remove(int index) {
		for(int i=index;i<size();i++) {
			a[i]=a[i+1];
		}
		a[p]=null;
		p--;
	}
	
}
public class Prg16 {

	public static void main(String[] args) {
		ArrayList a= new ArrayList();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(90);
		a.add(70);
		a.add(50);
		a.add(2,6);
		a.remove(6);
		System.out.println(a.size());
		for(int i=0;i<a.size();i++) {
			System.out.print(a.get(i)+" ");
		}
	}

}
