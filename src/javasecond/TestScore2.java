package javasecond;

import java.util.Scanner;

public class TestScore2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char grade; // To hold grade

        // Create a Scanner object to read input.
        Scanner console = new Scanner(System.in);

        // Get grade from the user.
        System.out.print("Enter grade: ");
        grade = console.next().charAt(0);

        // Determine and display grade
        switch (grade)
        {
        case 'A':
            System.out.println("Excellent");
            break;
        case 'B':
            System.out.println("Good");
            break;
        case 'C':
            System.out.println("Average");
            break;
        case 'D':
            System.out.println("Deficient");
            break;
        case 'F':
            System.out.println("Failing");
            break;
        default:
            System.out.println("Invalid input. Please Enter valid grade.");
        }
	}

}
