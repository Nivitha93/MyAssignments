package org.student;

import org.department.Department;

public class Student extends Department {
	public void studentName() {
		System.out.println("Nivitha");
	}
	public void studentDept() {
		System.out.println("CSE");
	}
	public void studentId() {
		System.out.println("10045");
	}

	public static void main(String[] args) {
     
		Student obj=new Student();
		obj.colegeName();
		obj.collegeCode();
		obj.collegeRank();
		obj.deptName();
		obj.studentName();
		obj.studentDept();
		obj.studentId();

	}

}
