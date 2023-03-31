import java.util.*;
public class Student_main {
    public static void main(String[] args) {
        student_functions student_functions_object = new
                student_functions();
        int c;
        do {
            System.out.println("Select the operation to modify database: ");
            System.out.println("0. Exit");
            System.out.println("1. Add student details");
            System.out.println("2. Display all");
            System.out.println("3. Search student");
            System.out.println("4. Update Details");
            System.out.println("5. Delete record");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            c = choice;
            switch (choice) {
                case 0:
                    System.out.println("Exiting...");
                    break;
                case 1:
                    student_functions_object.add_student();
                    break;
                case 2:
                    student_functions_object.display();
                    break;
                case 3:
                    student_functions_object.search();
                    break;
                case 4:
                    student_functions_object.update();
                    break;
                case 5:
                    student_functions_object.delete();
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (c != 0);
    }
}
