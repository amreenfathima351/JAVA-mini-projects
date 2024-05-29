import java.util.Scanner;
public class StudentGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        int marks = 0, subjectCount;
        double avg;
        System.out.print("Enter name of Student = ");
        name = sc.next();
        System.out.print("Enter Number of Subjects = ");
        subjectCount = sc.nextInt();
        for (int i = 0; i < subjectCount; i++) {
            System.out.println("Enter Marks of Subject "+(i+1)+": ");
            marks += sc.nextInt();
        }
        avg = ((double) marks) / subjectCount;
        System.out.println("Name = " + name);
        System.out.println("total marks " + marks);
        System.out.println("Average marks " + avg);
        if (avg > 80 && avg <= 100) {
            System.out.println("Grade = A");
        } else if (avg > 60 && avg <= 80) {
            System.out.println("Grade = B");
        } else if (avg > 30 && avg <= 60) {
            System.out.println("Grade = C");
        } else if (avg >= 0 && avg <= 30) {
            System.out.println("Grade = D");
        }
    }
}