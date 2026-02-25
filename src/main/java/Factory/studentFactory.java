package Factory;

import Domain;

public studentFactory {
    public static Student createStudent(String studentType, String studentId, String email,
    String department, String creditHours, double scholarshipAmount, boolean researchAssitant,
    double stipend) {

        if (studentType.equalsIgnoreCase("undergraduate")) {
            return new UndergraduateStudent.Builder()
                    .setStudentId(studentId)
                    .setName(name)
                    .setEmail(email)
                    .setDepartment(department)
                    .setCreditHours(creditHours)
                    .setScholarshipAmount(scholarshipAmount)
                    .build();
        } else if (studentType.equalsIgnoreCase("graduate")) {
            return new GraduateStudent.Builder()
                    .setStudentId(studentId)
                    .setName(name)
                    .setEmail(email)
                    .setDepartment(department)
                    .setResearchAssistant(researchAssitant)
                    .setStipend(stipend)
                    .build();
        } else {
            throw new IllegalArgumentException("Student type not supported");
        }
    }
}