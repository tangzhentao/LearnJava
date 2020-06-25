
// 重载带可变参数的方法

class OverloadVarArgs {
  public static void main(String[] args) {
    g(1, 2, 3);
    g(1l, 2L, 3L);
    g('1', '2', '3');

    // g(); // 都匹配，编译器不知道调用哪个g
  }

  /*下面的方法会与g(Integer... args)造成二义性*/
  // static void g(int... args) {
  //   System.out.println("Integer...");
  //   for (int i : args) {
  //     System.out.print(i + " ");
  //   }
  //   System.out.println();
  // }

  static void g(Integer... args) {
    System.out.println("Integer...");
    for (Integer i : args) {
      System.out.print(i + " ");
    }
    System.out.println();
  }

  static void g(Long... args) {
    System.out.println("Long...");
    for (Long i : args) {
      System.out.print(i + " ");
    }
    System.out.println();
  }

  static void g(Character... args) {
    System.out.println("Character...");
    for (Character i : args) {
      System.out.print(i + " ");
    }
    System.out.println();
  }

/*
g('1', '2', '3'); 不知道该调用下面的方法还是 g(Character... args)
  static void g(int iv, Character... args) {
    System.out.print("iv:"  + iv);
    System.out.println("Character...");
    for (Character i : args) {
      System.out.print(i + " ");
    }
    System.out.println();
  }
  */
}
