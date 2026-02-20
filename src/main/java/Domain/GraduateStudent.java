package Domain;

public class GraduateStudent extends Student {
    protected final String studentId;
    protected final String name;
    protected final String email;
    protected final String department;

    //Extra fields
    protected final boolean researchAssistant;
    protected final double stipend;

    private GraduateStudent(Builder builder) {
        this.studentId = builder.studentId;
        this.name = builder.name;
        this.email = builder.email;
        this.department = builder.department;
        this.researchAssistant = builder.researchAssistant;
        this.stipend = builder.stipend;
    }
    @Override
    public double calculateTuition(){
        double price = 3333;
        double subject = 9;
        return price * subject;
    }
    @Override
    public String getStudentType(){
        return "graduate student.";
    }
    @Override
    public void displayStudentDetails(){
        System.out.println(
                "Student ID: " + studentId +
                "\nStudent name: " + name +
                "\nStudent email: " + email +
                "\nDepartment: " + department +
                "\nResearch Assistant: " + researchAssistant +
                "\nStipend: " + stipend);
    }

    //Builder class
    public static class Builder {
        protected String studentId;
        protected String name;
        protected String email;
        protected String department;
        protected boolean researchAssistant;
        protected double stipend;

        public Builder setStudentId(String studentId) {
            this.studentId = studentId;
            return this;
        }
        public Builder setName(String name) {
            this.name = name;
            return this;
        }
        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }
        public Builder setDepartment(String department) {
            this.department = department;
            return this;
        }
        public Builder setResearchAssistant(boolean researchAssistant) {
            this.researchAssistant = researchAssistant;
            return this;
        }
        public Builder setStipend(double stipend) {
            this.stipend = stipend;
            return this;
        }
        public GraduateStudent build() {
            return new GraduateStudent(this);
        }
    }
}
