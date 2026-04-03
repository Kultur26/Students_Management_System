package Service;
import Domain.UndergraduateStudent;
import Domain.GraduateStudent;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        System.out.println("Which student are you(UngraduateStudent/Graduate): ");
        studentType = kbd.nextLine();
        if (studentType.equalsIgnoreCase("undergraduate")) {
            System.out.println("Enter Student ID: ");
            String studentId = kbd.nextLine();
            System.out.println("Enter name: ");
            String name = kbd.nextLine();
            System.out.println("Enter email: ");
            String email = kbd.nextLine();
            System.out.println("Enter department: ");
            String department = kbd.nextLine();
            System.out.println("Enter credit hours: ");
            String creditHours = kbd.nextLine();
            System.out.println("Enter scholarship amount: ");
            double scholarshipAmount = Double.parseDouble(kbd.nextLine());
        }


        
    }
}
