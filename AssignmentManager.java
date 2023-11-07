import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Trainer {
    public String teacherName;

    public Trainer(String teacherName) {
        this.teacherName = teacherName;
    }
}

class Student extends Trainer {
    public String studentName;
    public int prnNo;

    public Student(String teacherName, int prnNo, String studentName) {
        super(teacherName);
        this.prnNo = prnNo;
        this.studentName = studentName;
    }
}

class Assignment {
    public String title;
    public String date;
    public String description;
    public String assignee;

    public Assignment(String title, String date, String description, String assignee) {
        this.title = title;
        this.date = date;
        this.description = description;
        this.assignee = assignee;
    }

    @Override
    public String toString() {
        return "Assignment [title=" + title + ", date=" + date + ", description=" + description + ", assignee="
                + assignee + "]";
    }
}

public class AssignmentManager {

    public static Assignment createAssignment(Trainer trainer) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the assignment title: ");
        String title = sc.nextLine();
        System.out.println("Enter the assignment date: ");
        String date = sc.nextLine();
        System.out.println("Enter the assignment description: ");
        String description = sc.nextLine();

        return new Assignment(title, date, description, trainer.teacherName);
    }

    public static void showAssignments(ArrayList<Assignment> assignments) {
        System.out.println("Assignments:");
        for (Assignment assignment : assignments) {
            System.out.println(assignment);

        }
    }

    // public static void checkAssignments(List<Assignment> myList) {
    //     System.out.println("Enter the date in this format- ddmmyy don't make spaces between");
    //     Scanner scan = new Scanner(System.in);
    //     String mydate = scan.nextLine();
    //     if(mydate.date.equals(mydate)){
        
    //     }
    // }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("************************************************");
        System.out.println("This is the assignment maaging project");

        ArrayList<Assignment> assignmentList = new ArrayList<>();

        // System.out.println("Enter the number of studetns: ");
        // int numberOfstudents = sc.nextInt();
        // System.out.println("********************************");
        for (int i = 0; i < 2; i++) {
            System.out.println("Enter the student naam: ");
            String studentName = sc.nextLine();
            System.out.println("Enter the student PRN Number: ");
            int prnNo = Integer.parseInt(sc.nextLine());
            System.out.println("Enter the teacher Name: ");
            String teacherName = sc.nextLine();

            Student student = new Student(teacherName, prnNo, studentName);
            Assignment assignment = createAssignment(student);

            assignmentList.add(assignment);
        }
        showAssignments(assignmentList);
        // checkAssignments(assignmentList);
    }

}