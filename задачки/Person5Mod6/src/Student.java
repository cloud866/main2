public class Student extends Person {
    int grade;

    public Student(String name, int age, int grade) {
        super(name, age);
        this.grade = grade;  // initialize grade
    }

    public  void giveGrade() {} // add two methods
    public void praise(){}

}
