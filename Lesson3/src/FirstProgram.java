/*
Project name: "Четвертый урок"
31.10.2016
*/
public class FirstProgram {
  public static void main(String[] args) {
    Object obj  = new Object();
    String str = "hello";

    Student student1 = new Student();
    student1.setName("John Doe");
    student1.setAge(12);

    Student student2 = new Student();
    student2.setName("Jonathan Doelsky");
    student2.setAge(92);

    System.out.println(student1);
    System.out.println(student2);

    student2.growImidiately();
    System.out.println(student2);
    student2.growImidiately();
    System.out.println(student2);

    System.out.println(" My name was " + student2.getName());
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
  public void setName(String name) {
    this.name = name;
  }
  public String getName() {
    String name = "111";
    return "Mr. " + name;
  }
  public void setAge(int age) {
    this.age = age;
  }
  public int getAge() {
    return age;
  }
  public boolean isAlreadyDead() {
    return age >= 94;
  }
  public void growImidiately() {
    age++;
  }
}
