import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to get input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Ask the user for the student's name
        System.out.print("Enter student's name: ");
        String name = scanner.nextLine();
        
        // Ask the user to input marks for the student
        System.out.print("Enter marks for Subject 1: ");
        double marks1 = scanner.nextDouble();
        
        System.out.print("Enter marks for Subject 2: ");
        double marks2 = scanner.nextDouble();
        
        System.out.print("Enter marks for Subject 3: ");
        double marks3 = scanner.nextDouble();
        
        System.out.print("Enter marks for Subject 4: ");
        double marks4 = scanner.nextDouble();
        
        System.out.print("Enter marks for Subject 5: ");
        double marks5 = scanner.nextDouble();
        
        // Calculate the total and average marks
        double totalMarks = marks1 + marks2 + marks3 + marks4 + marks5;
        double averageMarks = totalMarks / 5;
        
        // Display the student's name, total marks, and average marks
        System.out.println("\nStudent Name: " + name);
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Marks: " + averageMarks);
        
        // Determine the grade based on average marks
        String grade;
        if (averageMarks >= 90) {
            grade = "A+";
        } else if (averageMarks >= 80) {
            grade = "A";
        } else if (averageMarks >= 70) {
            grade = "B";
        } else if (averageMarks >= 60) {
            grade = "C";
        } else if (averageMarks >= 50) {
            grade = "D";
        } else {
            grade = "F";
        }
        
        // Display the grade
        System.out.println("Grade: " + grade);
        
        // Close the scanner to avoid memory leaks
        scanner.close();
    }
}
