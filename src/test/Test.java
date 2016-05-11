package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		List stu = new ArrayList<Student>();
		stu.add(new Student(1, "张三", 78));
		stu.add(new Student(2, "李四", 96));
		stu.add(new Student(4, "王五", 66));
		stu.add(new Student(3, "赵六", 49));
		stu.add(new Student(5, "陈七", 81));
		Collections.sort(stu,new StuComp());
		System.out.println(stu);
	}

}
