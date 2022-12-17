package org.student;

import org.department.Department;

public class Student extends Department{

	public String studentName() {
		return "Hari Shivapriya Godhandapani";
	}
	public String studentDept()
	{
		return "CT";
	}
	public String studentId()
	{
		return "16-CT-34";
	}

	public static void main(String[] args) {
		Student st=new Student();
		System.out.println("Student Name is " +st.studentName()); 
		System.out.println("Student Department is "+st.studentDept());
        System.out.println("Student Id is "+st.studentId());
        System.out.println("Student Department Name is "+st.departmentName());
        System.out.println("College code is "+st.collegeCode());
        System.out.println("College Rank is "+st.collegeRank());
        System.out.println("College Name is "+st.collegeName());

	}

}
