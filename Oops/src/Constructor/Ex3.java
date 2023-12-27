package Constructor;
class Student{
	String name;
	Student(String name){
		this.name=name;
	}
	void display() {
		System.out.println("Student name is "+name);
	}
}
public class Ex3 {

	public static void main(String[] args) {
		Student s=new Student("Urfi Javed");
		s.display();

	}

}
