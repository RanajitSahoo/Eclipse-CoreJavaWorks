package raja.finalmock.Practice;

import java.util.Arrays;
import java.util.Objects;

class Student implements Comparable<Student>{
	int mark;
	String name;
	public Student(int mark, String name) {
		this.mark = mark;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [mark=" + mark + ", name=" + name + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(mark, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return mark == other.mark && Objects.equals(name, other.name);
	}
	@Override
	public int compareTo(Student o) {
		
		return o.name.compareTo(this.name);
	}
	
}
public class Prg49 {

	public static void main(String[] args) {
		Student[] s= {new Student(18, "Raja"),
				new Student(19, "Sinu"),
				new Student(23, "Madhu"),
				new Student(12, "Aki")};
		Arrays.sort(s);
		for(Student s1:s) {
			System.out.println(s1);
		}
		Arrays.sort(s,new Prg50());
		for(Student s1:s) {
			System.out.println(s1);
		}

	}

}
