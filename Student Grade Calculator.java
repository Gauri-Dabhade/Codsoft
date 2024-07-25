import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("---------------STUDENT GRADE CALCULATOR----------------");
        System.out.println("Enter total number of Subjects: ");
        int sub = scn.nextInt();
        int total = 0;

        System.out.println("Enter the marks of each subject:" +sub);
        for (int idx = 0; idx < sub; idx++) {
            int marks = scn.nextInt();
            total += marks;
        }

        System.out.println("Total marks obtained in Subjects: " + total);

        double avg = total/sub;
        System.out.println("Average of the total marks is "+avg);
        String grade;

        if (avg >= 100) {
            grade = "A+";
        } else if (avg >= 90) {
            grade = "A";
        } else if (avg >= 80) {
            grade = "B+";
        } else if (avg >= 70) {
            grade = "B";
        } else if (avg >= 60) {
            grade = "C";
        } else if (avg >= 50) {
            grade = "D";
        } else {
            grade = "Fail";
        }

        System.out.println("Grade obtained: " + grade);
        scn.close();
    }
}
