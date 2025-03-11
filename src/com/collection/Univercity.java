package com.collection;

import java.util.ArrayList;
import java.util.List;

class Faculty {

	String facultyName;
	Course course;

	public Faculty(String facultyName, Course course) {

		this.facultyName = facultyName;
		this.course = course;
	}

}

class Student {

	String studentName;
	Course courses;

	public Student(String studentName, Course courses) {

		this.studentName = studentName;
		this.courses = courses;
	}

}

class Course {

	String courseCode;
	String subjectName;

	public Course(String courseCode, String subjectName) {

		this.courseCode = courseCode;
		this.subjectName = subjectName;
	}

}

public class Univercity {

	List<Course> courseList = new ArrayList<Course>();
	List<Faculty> faculties = new ArrayList<Faculty>();
	List<Student> students = new ArrayList<Student>();

	public void addCourse() {

		// List<Course> courseList = new ArrayList<Course>();
		courseList.add(new Course("ABC123", "JAVA"));
		courseList.add(new Course("ABC124", "PYTHON"));
		courseList.add(new Course("ABC125", "JS"));

//		for(Course c:courseList) {
//			System.out.println(c.courseCode  + " "+ c.subjectName);
//		}
//		

		Faculty samir = new Faculty("Samir", courseList.get(1));
		Faculty tejas = new Faculty("Tejas", courseList.get(0));

		faculties.add(samir);
		faculties.add(tejas);

//		for(Faculty f:faculties) {
//			
//			System.out.println(f.facultyName + " "+f.course.subjectName);
//			
//		}

		Student jay = new Student("jay", courseList.get(0));
		Student parth = new Student("parth", courseList.get(1));

		students.add(jay);
		students.add(parth);

		for (Student s : students) {

			Faculty faculty = getFacultyByCourse(s.courses);
			if (faculty != null) {
				System.out.println(s.studentName + " " + s.courses.subjectName + " " + faculty.facultyName);
			} else {
				System.out.println("no faculty found...");
			}

		}

	}

	public Faculty getFacultyByCourse(Course cource) {

		for (Faculty faculty : faculties) {

			if (faculty.course.equals(cource)) {
				return faculty;
			}

		}

		return null;
	}

	public static void main(String[] args) {

		Univercity u = new Univercity();
		u.addCourse();

	}
}
