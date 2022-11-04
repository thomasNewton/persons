package persons;

import java.util.ArrayList;

public class Course {

 private String name;
 private Professor instructor;
 private ArrayList<Student> students_list;
 public final int max_size;
 private int size;
 public final int min_age;



 public Course(String name, Professor instructor, int max_size, int size, int min_age) {
  this.name = name;
  this.instructor = instructor;
  this.max_size = max_size;
  this.size = size;
  this.min_age = min_age;
  this.students_list = new ArrayList<Student>();
 }

 public String getName() {
  return name;
 }

 public void setName(String name) {
  this.name = name;
 }

 public Professor getInstructor() {
  return instructor;
 }

 public void setInstructor(Professor instructor) {
  this.instructor = instructor;
 }

 public ArrayList<Student> getStudents_list() {
  return students_list;
 }

 public void setStudents_list(ArrayList<Student> students_list) {
  this.students_list = students_list;
 }

 public int getSize() {
  return size;
 }

 public void setSize(int size) {
  this.size = size;
 }

 public int getMax_size() {
  return max_size;
 }

 public int getMin_age() {
  return min_age;
 }

 public void addStudent(Student student){
  if(student.getAge() >= this.min_age) {
   if (this.size < this.max_size) {
    size++;
    System.out.println("Congratulates " + student.getName() + " was added to this class: " + this.getName());
    System.out.println(this.max_size - this.size + " spaces left in this course");
    student.setMyCourse(this);
   } else {
    System.out.println("sorry class is full "+student.getName()+ " was not added to course");
   }
  }
  else {
   System.out.println("Sorry, "+student.getName()+ ", you are not old enough to enroll in this class, we use power tools");
   }
 }




}
