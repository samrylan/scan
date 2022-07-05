package org.college;

public class College {

	private void collegeName() {
		System.out.println("collegeName:jainuniversity");
		}
		private void collegeCode() {
		System.out.println("collegeCode:210810");
		}
		private void collegeRank() {
		System.out.println("collegeRank:1Rank");
		}
public static void main(String[] args) {
	College c=new College();
c.collegeName();
c.collegeCode();
c.collegeRank();
Hostel h=new Hostel();
h.hostelName();
Student s=new Student();
s.studentName();
s.studentDept();
s.studentId();
Dept d=new Dept();
d.deptName();
}
}
