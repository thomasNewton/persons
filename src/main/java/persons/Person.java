package persons;

public class Person {
    private int age;
    private String name;



    public Person(){
        this.age = -1;
        this.name= "unknown";
    }

    public Person( int age, String name){
        this.age = age;
        this.name = name;
    }


    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void greet(){
        System.out.println("Good Morning, How Are You Today?");
    }

    public void introduce(){
        System.out.println("I am "+name+" and am "+age+" years old");
    }







}
