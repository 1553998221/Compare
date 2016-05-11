package test;

import java.util.Comparator;
//implements Comparable<Student>
public class Student {
	private int num;
	private String name;
	private int score;
	
	
	public Student(int num, String name, int score) {
		super();
		this.num = num;
		this.name = name;
		this.score = score;
	}
	
	@Override
	public String toString() {
		return "Student [num=" + num + ", name=" + name + ", score=" + score + "]";
	}

	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}

	public int compareTo(Student o) {
		int res = 0;
		if(this.num > o.num)
			res = 1;
		else if(this.num < o.num)
			res = -1;
		else
			res = 0;
		return res;
	}
	
}

