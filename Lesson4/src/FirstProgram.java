/*
Project name: "Четвертый урок"
31.10.2016
*/
public class FirstProgram {
  public static void main(String[] args) {
    Object obj  = new Object();
    String str = "hello";

    Student student = new Student();
    student.name = "John Doe";
    student.age = 12;

    System.out.println(student);
  }
}
class Student {
  String name;
  int age;
}
