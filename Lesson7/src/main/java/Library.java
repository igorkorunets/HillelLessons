/*
 * This Java source file was auto generated by running 'gradle buildInit --type java-library'
 * by 'Jonathan' at '28.11.16 1:16' with Gradle 3.1
 *
 * @author Jonathan, @date 28.11.16 1:16
 */
import jelementary.*;

public class Library {
    public boolean someLibraryMethod() {
        return true;
    }

    public static void main(String ... args) {
      Engineer eng = new Engineer("John");
      eng.sayHello();

      QA qa = new QA("Jane");
      qa.sayHello();
    }
}