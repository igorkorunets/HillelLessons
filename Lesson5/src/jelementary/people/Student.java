package jelementary.people;

import jelementary.School;
import jelementary.Group;

public class Student {
  private String name;
  private School school;
  private Group group;

  public void setStudent(String name, School school, Group group) {
    this.name = name;
    this.school = school;
    this.group = group;
  }

  public String getStudent() {
    return "Student: " + name + ", School: " + school.getSchool() + ", Group: " + group.getGroup();
  }
}
