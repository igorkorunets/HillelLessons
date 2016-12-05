import one.*;
import two.*;

import init.One;

public class Main {
  public static void main(String...args) {
    BB bb = new BB();
    bb.foo();
    //bb.str("111");

    System.out.println(BB.CONSTANT_STRING);
    print(BB.CONSTANT_STRING);
    print2(Types.ODD);

    B b = new B();
    //b.foo();

    System.out.println("-------------------");
    One one = new One();
    One one2 = new One();
  }

  public static void print(String type) {
    System.out.println(type);
  }

  public static void print2(Types type) {
    System.out.println(type);
  }
}
