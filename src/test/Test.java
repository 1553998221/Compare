package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		List stu = new ArrayList<Student>();
		stu.add(new Student(1, "����", 78));
		stu.add(new Student(2, "����", 96));
		stu.add(new Student(4, "����", 66));
		stu.add(new Student(3, "����", 49));
		stu.add(new Student(5, "����", 81));
		Collections.sort(stu,new StuComp());
		System.out.println(stu);
	}

}
