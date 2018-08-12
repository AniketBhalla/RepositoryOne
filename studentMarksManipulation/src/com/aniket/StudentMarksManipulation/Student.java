// To fetch the marks from different students and calculating their percentages(%) if required.
package com.aniket.StudentMarksManipulation;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Student {
	
	
		private static final String SCHOOL_NAME = "Bhartiya Vidya Mandir";
		private static final byte SUBJECT_COUNT = 3;
		public final double PERCENTAGE_CALCULATE(double[] yourMarks) {
			double total = 0;
			for(int i=0; i<yourMarks.length; i++) {
				total += yourMarks[i];
			}
			return total/SUBJECT_COUNT;	// returns % of every student;
		}
		
		private String name;
		private byte age;
		private int id;					// id of every student : kept private
		private double[] yourMarks;		// marks of every student : kept private
		protected boolean calculatePercentage = true;
		public Student(String name, byte age, int id) {
			super();
			this.name = name;
			this.age = age;
			this.id = id;
		}
	
		@Override
		public String toString() {
			return "Name : "+this.name+", Age : "+this.age+", id : "+this.id+", school : "+SCHOOL_NAME;
		}
		
		public void getMarks() {
			System.out.println("Enter marks of "+SUBJECT_COUNT+ " subjects\n");
			Scanner input = new Scanner(System.in);
			
			double marksInputByUser[] = new double[SUBJECT_COUNT];	//arrayLength = numberOfSubjects
			try {
				for(int i=0; i<marksInputByUser.length; i++) {
					marksInputByUser[i] = input.nextDouble();
				}
			}catch(InputMismatchException | ArrayStoreException ex) {	//check marks input is correct or not.
				System.out.println("[ALLERT] : Marks Entered Incorrectly");	
				System.exit(1);		// abnormal termination
			}
			this.yourMarks = marksInputByUser;
			System.out.println("Marks entered..!!");
			
			//===============================checking============================================
			System.out.println("Do you want to calculate you %..?? if yes then enter yes/y");
			String userPermission = null;
			try {
				 userPermission = input.next();	//to check user input in String only
			} catch (InputMismatchException inpEx) {
				System.out.println("permission's data type error");
				input.close();
				return;
			}
			String permissions = "Yes yes y Y";
			boolean b = true; 
			b = permissions.contains(userPermission);
			System.out.println(b);
			input.close(); //stop taking input
			if(b) {
				System.out.println("your % = "+this.PERCENTAGE_CALCULATE(this.yourMarks));;
			}
			/*String[] ar = new String[] {"Yes", "yes", "y", "Y"};
			Arrays.stream(ar).anyMatch(Yes", "yes", "y", "Y"::equls);
			*/
		}
	}



