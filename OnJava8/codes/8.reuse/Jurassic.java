
// 演示final 类

class SmallBrain {}

final class Dinosaur {
  int i = 7;
  int j = 1;
  SmallBrain x = new SmallBrain();

  void f() {}
}

// class Further extends Dinosaur {} // 编译时错误

public class Jurassic {
  public static void main(String[] args) {
    Dinosaur n = new Dinosaur();
    n.f();
    n.i = 30;
    n.j++;
  }
}
