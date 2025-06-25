import java.util.*;

public class Grades {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the marks:");
        int marks = in.nextInt();

        if (marks >= 90 && marks <= 100) {
            System.out.println("A+ grade");
        } else if (marks >= 80 && marks < 90) {
            System.out.println("A grade");
        } else if (marks >= 70 && marks < 80) {
            System.out.println("B+ grade");
        } else if (marks >= 60 && marks < 70) {
            System.out.println("B grade");
        } else if (marks >= 50 && marks < 60) {
            System.out.println("C grade");
        } else if (marks >= 40 && marks < 50) {
            System.out.println("D grade");
        } else if (marks >= 0 && marks < 40) {
            System.out.println("Fail");
        } else {
            System.out.println("Invalid marks entered! Please enter a value between 0 and 100.");
        }
    }
}
