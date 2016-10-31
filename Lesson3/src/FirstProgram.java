/*
Project name: "Четвертый урок"
31.10.2016
*/
public class FirstProgram {
  public static void main(String[] args) {
    Object obj  = new Object();
    String str = "hello";

    Student student1 = new Student();
    student1.name = "John Doe";
    student1.age = 12;

    Student student2 = new Student();
    student2.name = "Jonathan Doelsky";
    student2.age = 92;

    System.out.println(student1);
    System.out.println(student2);

    while(student2.isAlreadyDead()) {

    }
    student2.growImidiately();
    System.out.println(student2);
    student2.growImidiately();
    System.out.println(student2);
  }
}
class Student {
  String name;
  int age;

  public String toString() {
    if (isAlreadyDead())
    return "I was a student. I'm dead now :(";
    return "I'm a student. My name is " + name + ". I'm " + age + " years old.";
  }
  public boolean isAlreadyDead() {
    return age >= 94;
  }
  public void growImidiately() {
    age++;
  }
}
