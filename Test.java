import java.util.Scanner;

public class StudentGrade {
    private String name;
    private int[] scores;

    public StudentGrade(String name, int[] scores) {
        this.name = name;
        this.scores = scores;
    }

    public double calculateAverage() {
        int total = 0;
        for (int score : scores) {
            total += score;
        }
        return (double) total / scores.length;
    }

    public char getGrade() {
        double avg = calculateAverage();
        if (avg >= 90) return 'A';
        if (avg >= 80) return 'B';
        if (avg >= 70) return 'C';
        if (avg >= 60) return 'D';
        return 'F';
    }

    public void displayResult() {
        System.out.println("Student: " + name);
        System.out.println("Average: " + calculateAverage());
        System.out.println("Grade: " + getGrade());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        int[] scores = new int[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter score #" + (i + 1) + ": ");
            scores[i] = sc.nextInt();
        }

        StudentGrade student = new StudentGrade(name, scores);
        student.displayResult();

        sc.close();
    }
}
