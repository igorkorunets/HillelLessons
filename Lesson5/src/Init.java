public class Init {
  public static String staticString = "StaticString";
  public String nonStaticString = "NonStaticString";

  public Init() {
    System.out.println(staticString);
    System.out.println(nonStaticString);
  }
}
