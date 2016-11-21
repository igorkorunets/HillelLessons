/*
Project name: "Пятый урок"
20.11.16
*/
import jelementary.School;
import jelementary.Group;
import jelementary.people.Student;

class Main {
  public static void main(String ... args) {
    School school = new School();
    school.setSchool("Hillel");
    Group group = new Group();
    group.setGroup("Java Elementary", school);
    Student student = new Student();
    student.setStudent("Женя Doe", school, group);

    System.out.println(student.getStudent());

    Init init = new Init();
  }
}
