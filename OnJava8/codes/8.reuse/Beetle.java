
// 继承和初始化 -- 演示类加载过程
class Inset {
  private int i = 9;
  protected int j;

  Inset() {
    System.out.println("i = " + i + ", j = " + j);
    j = 39;
  }

  private static int x1 = printInit("static Inset.x1 initialized");

  static int printInit(String s) {
    System.out.println(s);
    return 47;
  }
}

public class Beetle extends Inset {
  private int k = printInit("Beetle.k.initialized");

  public Beetle() {
    // 此处会自动调用 super();
    System.out.println("k = " + k);
    System.out.println("j = " + j);
  }

  private static int x2 = printInit("static Beetle.x2 initialized");

  public static void main(String[] args) {
    System.out.println("Beetle constructor");
    Beetle b = new Beetle();
  }

}
