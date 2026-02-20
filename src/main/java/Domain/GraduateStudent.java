package Domain;

public class GraduateStudent extends Student {
    protected String studentId;
    protected String name;
    protected String email;
    protected String department;

    //Extra fields
    protected boolean researchAssistant;
    protected double stipend;

    public abstract double calculateTuition();
    public abstract String getStudentType();
    public void displayStudentDetails(){};
}
