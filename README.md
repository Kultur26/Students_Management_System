## Application of SOLID Principles

### Single Responsibility Principle
The Single Responsibility Principle states that a class should have only one reason to change. This is demonstrated by separating the construction of an UndergraduateStudent object into its own inner Builder class. The UndergraduateStudent class is responsible for the student's behaviour and data, while the Builder class is solely responsible for constructing the object by setting its fields. This ensures that changes to how the object is built do not affect the student's core logic, and vice versa.

**Code Snippet**
```java
public static class Builder {
    protected String studentId;
    protected String name;
    protected String email;
    protected String department;
    protected String creditHours;
    protected double scholarshipAmount;

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
    public Builder setCreditHours(String creditHours) {
        this.creditHours = creditHours;
        return this;
    }
    public Builder setScholarshipAmount(double scholarshipAmount) {
        this.scholarshipAmount = scholarshipAmount;
        return this;
    }
    public UndergraduateStudent build() {
        return new UndergraduateStudent(this);
    }
}
```

### Open/Closed Principle
The Open/Closed principle states that entities, in this case methods and classes, must be open for extension but closed for modification because it allows subsequent classes to use the logic that is being defined in the superclass. It is closed for modification because subclasses do not need to modify the methods and fields created in the superclass. This is demonstrated by the abstract methods in `Student`, which define a contract that subclasses like `UndergraduateStudent` implement without altering the superclass itself.
```java
// Student - closed for modification
public abstract double calculateTuition();

// UndergraduateStudent - open for extension
@Override
public double calculateTuition(){
    double price = 3333;
    double subject = 9;
    return price * subject;
}
```
