package com.aniket.StudentMarksManipulation;

public class MarksManipulation {
	public static void main(String[] args) {		
		
		Student ani = new Student("Aniket", (byte)20, 100);	
		System.out.println(ani);	// check details of student
		ani.getMarks();  		// To let students to enter their marks
	}
}
