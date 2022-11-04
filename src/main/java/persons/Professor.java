package persons;

public class Professor extends Person{


    private String school;
    private Boolean tenure;

    public Professor(Person person, String school, Boolean tenure){
         this(person.getAge(),person.getName(),school,tenure);
    }

    public Professor(int age, String name, String school, Boolean tenure){
        super(age,"Professor "+name);
        this.school = school;
        this.tenure = tenure;


    }


    public void setSchool(String school) {
        this.school = school;
    }

    public void setTenure(Boolean tenure) {
        this.tenure = tenure;
    }

    public Boolean getTenure() {
        return tenure;
    }

    public String getSchool() {
        return school;
    }


    public void setName(String name){
        super.setName("Professor "+ name);
    }







}
