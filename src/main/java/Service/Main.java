package Service;
import Domain.UndergraduateStudent;
import Domain.GraduateStudent;

public class Main {
    public static void main(String[] args) {
        UndergraduateStudent undergrad = new UndergraduateStudent.Builder()
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
        System.out.println("You tuition fee is: R" + grad.calculateTuition());
    }
}
