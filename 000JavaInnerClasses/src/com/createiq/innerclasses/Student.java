package com.createiq.innerclasses;

public class Student {

	private int sid;
	private String name;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private double fee;
	private Marks marks;

	public Student(int sid, String name, double fee, Marks marks) {

		this.sid = sid;
		this.name = name;
		this.fee = fee;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", fee=" + fee + ", marks=" + marks + "]";
	}

	// 1. composition strong association and weak association
	// 2. If your inner class having final, static, private members, can i access
	// those
	// 3. complete this inner and compostion task
	// 4. if student name not be null then only you can update
	// 5. get the list of student names only

}
