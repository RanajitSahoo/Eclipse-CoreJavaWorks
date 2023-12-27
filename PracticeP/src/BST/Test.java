package BST;

public class Test {

	public static void main(String[] args) {
		BST b=new BST();
		b.add(50);
		b.add(40);
		b.add(30);
		b.add(60);
		b.add(55);
		b.add(70);
		b.remove(60);
		b.levelOrder();

	}

}
