
// 可选的尾随参数
class OptionalTrailingArguments {
  public static void main(String[] args) {
    f(1);
    f(2, "tom", "jerry");
  }

  static void f(int required, String... trailing) {
    System.out.println("required:" + required);
    for (String s : trailing) {
      System.out.print(s + " ");
    }
    System.out.println("");

  }
}
