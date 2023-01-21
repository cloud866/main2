public class Teacher extends People {
    String subject;

    public Teacher(String name, int age, String profession, String subject) {
        super(name, age, profession);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getProfession() {
        return profession;
    }

    public String giveALesson() {
        return "The lesson was ended";
    }
}
