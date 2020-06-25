
class Bowl {
  Bowl(int marker) {
    System.out.println("Bowl(" + marker + ")");
  }

  void f1(int marker) {
    System.out.println("f1(" + marker + ")");
  }
}

class Table {
  static Bowl b1 = new Bowl(1);

  Table() {
    System.out.println("Table()");
    b2.f1(1);
  }

  void f2(int marker) {
    System.out.println("f2(" + marker + ")");
  }

  static Bowl b2 = new Bowl(2);
}

class Cupboard{
  Bowl b3 = new Bowl(3);
  static Bowl b4 = new Bowl(4);

  Cupboard() {
    System.out.println("Cupboard()");
    b4.f1(2);
  }

  void f3(int marker) {
    System.out.println("f3(" + marker + ")");
  }

  static Bowl b5 = new Bowl(5);
}

public class StaticInitialization {
  public static void main(String[] args) {
    System.out.println("main creating cupboard.");
    new Cupboard();
    System.out.println("main creating cupboard.");
    new Cupboard();

    table.f2(1);
    cup.f3(1);
  }

  static Table table = new Table();
  static Cupboard cup = new Cupboard();
}
