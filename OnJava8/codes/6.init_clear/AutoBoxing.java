// 自动装箱和可变参数和谐相处

class AutoBoxing {
  public static void main(String[] args) {
    g(1, 2, 3);
  }

  static void g(Integer... args) {
    for (Integer i : args) {
      System.out.print(i + " ");
    }
    System.out.println();
  }
}
