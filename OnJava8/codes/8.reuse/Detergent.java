
// 演示 继承

class Cleanser {
  private String s = "Cleanser";
  public  void append(String a) { s += a; }
  public void dilute() { append(" dilute()"); }
  public void apply() { append(" apply()"); }
  public void scrub() { append(" scrub()"); }

  @Override public String toString() { return s;}

  // 在本类中调用main，并不需要public，加public是为了在终端能单独允许这个类
  public static void main(String[] args) {
    Cleanser x = new Cleanser();
    x.dilute();
    x.apply();
    x.scrub();
    System.out.println(x);
  }
}

public class Detergent extends Cleanser {

  // 改变方法的行为
  @Override public void scrub() {
    append(" Detergent.scrub()");
    super.scrub();
  }
  // 添加方法
  public void foam() { append(" foam()"); }

  public static void main(String[] args) {
    Detergent x = new Detergent();
    x.dilute();
    x.apply();
    x.scrub();
    x.foam();
    System.out.println(x);
    System.out.println("Tesing base class:");
    Cleanser.main(args);
  }
}
