import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class StudentManagementSystem {
    List<Student> students;
    public StudentManagementSystem() {
        students = new ArrayList<Student>();
    }
    public void addStudents(){
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        boolean restart = false;
        int studentCount = 0;
        try {
            do {
                restart = false;
                try {
                    System.out.print("Enter number of students to add: ");
                    studentCount = Integer.parseInt(input.readLine());
                    if (studentCount < 0) {
                        System.out.println("Invalid value. Please reenter.");
                        restart = true;
                    }
                } catch (NumberFormatException nfe) {
                    System.out.println("Invalid value. Please reenter.");
                    restart = true;
                }
            } while (restart);
            for (int i = 0; i < studentCount; i++)
                addStudent(input);
        } catch (IOException ioe) {
            System.err.println(ioe.getMessage());
        } 
    }

    public void addStudent(BufferedReader input) throws IOException {
        boolean restart = false;
        int rollNumber = -1;
        int englishMarks = -1;
        int mathMarks = -1;
        int scienceMarks = -1;

        System.out.print("Enter student name: ");
        String name = input.readLine();

        do {
            restart = false;
            try {
                System.out.print("Enter student roll number: ");
                rollNumber = Integer.parseInt(input.readLine());
            } catch (NumberFormatException nfe) {
                System.out.println("Invalid value. Please reenter.");
                restart = true;
            }
        } while (restart);

        do {
            restart = false;
            try {
                System.out.print("Enter student's English marks: ");
                englishMarks = Integer.parseInt(input.readLine());
            } catch (NumberFormatException nfe) {
                System.out.println("Invalid value. Please reenter.");
                restart = true;
            }
        } while (restart);

        do {
            restart = false;
            try {
                System.out.print("Enter student's Mathematics marks: ");
                mathMarks = Integer.parseInt(input.readLine());
            } catch (NumberFormatException nfe) {
                System.out.println("Invalid value. Please reenter.");
                restart = true;
            }
        } while (restart);

        do {
            restart = false;
            try {
                System.out.print("Enter student's Science marks: ");
                scienceMarks = Integer.parseInt(input.readLine());
            } catch (NumberFormatException nfe) {
                System.out.println("Invalid value. Please reenter.");
                restart = true;
            }
        } while (restart);

        students.add(
            new Student(name,rollNumber,englishMarks,mathMarks,scienceMarks)
        );
    }
    public void displayStudentInfo() {
        for (Student s : students) {
            System.out.println("-------");
            System.out.println("Name: "+s.getName());
            System.out.println("Roll number: "+s.getRollNumber());
            System.out.println("English marks: "+s.getEnglishMarks());
            System.out.println("Math marks: "+s.getMathMarks());
            System.out.println("Science marks: "+s.getScienceMarks());
            System.out.println("Grade: "+s.calculateGrade());
        }
    }
}
