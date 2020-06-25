// 可变参数的类型

class VarArgType {
  public static void main(String[] args) {
    f('a', 'b');
    f();

    g(1, 2, 3);
    g();

    int [] a;
    a = new int[2];
    System.out.print(a.getClass());

  }

  static void f(Character... args) {
    System.out.print(args.getClass());
    System.out.println(" length: " + args.length);
  }

  static void g(int... args) {
    System.out.print(args.getClass());
    System.out.println(" length: " + args.length);
  }

}
