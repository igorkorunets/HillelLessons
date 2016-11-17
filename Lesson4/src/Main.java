/*
Project name: "Пятый урок"
16.11.2016
*/
public class Main {
  public static void main(String ...args) {

    LightBulb bulb = new LightBulb();
    bulb.on();

    LightBulb bulb2 = new LightBulb();
    bulb.switchBulb();

    if (bulb.equalTo(bulb2)) {
      System.out.println("The bulbs are equal");
    } else {
      System.out.println("The bulbs are not equal");
    }
  }
}
