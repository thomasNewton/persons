package persons;

public class Student extends Person{


    private double gpa;
    private String major;


    private Course myCourse;

    public Student(int age, String name, double gpa, String major){
        super(age,name);
        this.gpa = gpa;
        this.major = major;
    }

    public Student(Person aPerson, double gpa, String major){
        super(aPerson.getAge(),aPerson.getName());
        this.gpa = gpa;
        this.major = major;

    }


    public double getGpa() {
        return gpa;
    }

    public String getMajor() {
        return major;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void setMajor(String major) {
        this.major = major;
    }


    public void setMyCourse(Course myCourse){
        this.myCourse = myCourse;
    }

    public Course getMyCourse() {
        return myCourse;
    }

    public void greet(boolean formal) {
        if (formal) {
            super.greet();
        }
        else {
            System.out.println("Hey whats up? How you doing today?");
        }

    }

}
