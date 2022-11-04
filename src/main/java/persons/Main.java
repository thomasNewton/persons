package persons;

public class Main {
    public static void main(String[] args) {

        Person p = new Person();
        Person j = new Person(12,"Jason");
        Student k = new Student(4,"sally",2.0,"preschool");
        Student jj = new Student(j,3.0,"History");
        Student jon = new Student(20,"Johnny Rotten",4.0,"Music");
        Student sal = new Student(18,"Sally Struthers",2.8,"Fitness");
        Student kim = new Student(21,"Kim Jung",3.6,"Political Science");
        Student ann = new Student(19,"Ann Hathaway",1.03,"Drama");
        Person leroy = new Person(36, "Leroy Jenkins");
        Professor jenkins = new Professor(leroy,"U DUB", Boolean.TRUE);
        Professor fred = new Professor(45 ,"Slick Rick", "Old School", Boolean.FALSE) ;

        Course course = new Course("A History of Power Tools" , jenkins, 3 , 0 , 18);
        course.addStudent(ann);
        course.addStudent(jon);
        course.addStudent(jj);
        course.addStudent(sal);
        course.addStudent(kim);
        








    }

}