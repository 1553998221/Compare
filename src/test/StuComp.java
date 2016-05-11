package test;

import java.util.Comparator;

public class StuComp implements Comparator<Student>{
	@Override
	public int compare(Student o1, Student o2) {
		Student stu1 = (Student)o1;
		Student stu2 = (Student)o2;
		int res = 0;
		if(stu1.getScore() > stu2.getScore())
			res = 1;
		else if(stu1.getScore() < stu2.getScore())
			res = -1;
		else
			res = 0;
		return res;
	}

}
