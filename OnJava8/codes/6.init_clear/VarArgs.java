
// 可变参数

class A {}

class VarArgs {
  public static void main(String[] args) {

    printArray(new Object[] {1, 2.2, "tim", new A()});
    // printArray(); // 不传参数报错

    System.out.println("java 5可变参数");
    printVarArgs(1, (float)2, "jim", new A());
    printVarArgs((Object)new Integer[] {12, 34});
    printVarArgs();
  }

  // 使用一个数组是实现可变参数：缺点是，参数不能为空
  static void printArray(Object [] args) {
    for (Object obj : args) {
      System.out.print(obj + " ");
    }
    System.out.println("");
  }

  // java 5以后的可变参数
  static void printVarArgs(Object... args) {
    for (Object obj : args) {
      System.out.print(obj + " ");
    }
    System.out.println("");
  }
}
