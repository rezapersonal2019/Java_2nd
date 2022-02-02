package javasecond;

import java.util.Scanner;

public class TestScore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int marks1, marks2, marks3; // To hold marks in three subjects
        double average; // To hold average Marks
        char grade; // To hold grade

        // Create a Scanner object to read input.
        Scanner console = new Scanner(System.in);

        // Get value from the user.
        System.out.print("Enter marks of subject 1: ");
        marks1 = console.nextInt();

        System.out.print("Enter marks of subject 2: ");
        marks2 = console.nextInt();

        System.out.print("Enter marks of subject 3: ");
        marks3 = console.nextInt();

        // Calculate average marks.
        average = (marks1 + marks2 + marks3) / 3.0;

        if (average >= 90)
        {
            grade = 'A';
        } 
        else if (average >= 80)
        {
            grade = 'B';
        } 
        else if (average >= 70)
        {
            grade = 'C';
        } 
        else if (average >= 60)
        {
            grade = 'D';
        } 
        else
        {
            grade = 'F';
        }

        // Display grade.
        System.out.println("Grade is: " + grade);
	}

}
