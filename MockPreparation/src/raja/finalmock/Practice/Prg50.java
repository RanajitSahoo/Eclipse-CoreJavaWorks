package raja.finalmock.Practice;

import java.util.Comparator;

public class Prg50 implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		
		return o2.mark-o1.mark;
	}

	

}
