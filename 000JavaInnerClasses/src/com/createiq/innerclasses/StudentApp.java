package com.createiq.innerclasses;

public class StudentApp {
	public static void main(String[] args) {
		Marks marks = new Marks(82, 75, 95);
		Student s1 = new Student(100, "anil", 15000.00, marks);
		Student s2 = new Student(100, null, 15000.00, marks);
		System.out.println(s1.getName());
		if (s2.getName() != null) {
			s2.setName("anil b");
		} else {
			System.out.println(" name is not initialized....");
		}
		System.out.println(s1);
		System.out.println("student one total marks " + marks.total());
		double total = marks.total();
		System.out.println("student one avg marks: " + marks.avg(total));

		Marks.Results result = marks.new Results();
		double avg = marks.avg(total);
		result.grade(avg);

	}

}
