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

            //Continue the code from here
        }


        /*UndergraduateStudent undergrad = new UndergraduateStudent.Builder()
                .setStudentId("221312536")
                .setName("Joshua Bonzet")
                .setEmail("221312536@mycput.ac.za")
                .setDepartment("Informatics and Design")
                .setCreditHours("5000 hours")
                .setScholarshipAmount(50000)
                .build();
        System.out.println("Your tuition fee is: R" + undergrad.calculateTuition());
        System.out.println("You are an " + undergrad.getStudentType());

        GraduateStudent grad = new GraduateStudent.Builder()
                .setStudentId("123456789")
                .setName("Caylin Vermeulen")
                .setEmail("caylinVermeulen@gmail.com")
                .setDepartment("Arts and Sciences")
                .setResearchAssistant(true)
                .setStipend(5000)
                .build();
        System.out.println("You are a " + grad.getStudentType());
        System.out.println("You tuition fee is: R" + grad.calculateTuition()); */
    }
}
