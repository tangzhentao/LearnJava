
class Cup {
  Cup(int marker) {
    System.out.println("Cup(" + marker + ")");
  }

  void f(int marker) {
    System.out.println("f(" + marker + ")");
  }
}

class Cups {
  static Cup c1;
  static Cup c2;

  static {
    c1 = new Cup(1);
    c2 = new Cup(2);
  }
  Cups(int marker) {
    System.out.println("Cups()");
  }

  void f(int marker) {
    System.out.println("f(" + marker + ")");
  }
}

class ExplicitStatic {
  public static void main(String[] args) {
    System.out.println("inside main");
    Cups.c1.f(99);
  }

  static Cups cups1 = new Cups(1);
  static Cups cups2 = new Cups(2);

}
