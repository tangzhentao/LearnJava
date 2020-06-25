// 演示私有权限

class Sundae {
  private Sundae() {
    System.out.println("Sundae()");
  }

  static Sundae makeASundae() {
    return new Sundae();
  }
}

class IceCream {
  public static void main(String[] args) {

    // Sundae s = new Sundae(); // 编译错误
    Sundae s = Sundae.makeASundae();
  }
}
