package week3.day1;

public class Student {
	public void getStudentInfo(int id) {
		System.out.println("Student ID is "+id);
		
	}
	public void getStudentInfo(int id, String name) {
		System.out.println("Student ID is "+id);
		System.out.println("Student name is "+name);
		
	}
	
	public void getStudentInfo(String email,int phNo) {
		System.out.println("Student Email ID is "+email);
		System.out.println("Student Phone no is "+ phNo);
		
	}
	

	public static void main(String[] args) {
		Student stud=new Student();
		stud.getStudentInfo(1101);
		stud.getStudentInfo(1234, "Nivitha");
		stud.getStudentInfo("abc@gmail.com", 983523456);

	}

}
