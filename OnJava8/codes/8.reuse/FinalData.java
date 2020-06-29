
// final的用法

import java.util.*;

class Value {
  int i;

  Value(int i) {
    this.i = i;
  }
}

public class FinalData {
  private static Random random = new Random(47);
  private String id;

  public FinalData(String id) {
    this.id = id;
  }

  // 可能是编译时常量
  private final int valueOne = 9;
  private static final int VALUE_TWO = 99;
  // 典型的公有常量
  public static final int VALUE_THREE = 39;
  // 不是编译时常量
  private final int i4 = random.nextInt(20);
  static final int INT_5 = random.nextInt(20);
  private Value v1 = new Value(11);
  private final Value v2 = new Value(22);
  private static final Value VAL_3 = new Value(33);

  // 数组
  private final int [] a = {1, 2, 3};

  @Override
  public String toString() {
    return id + ": " + "i4 = " + i4 + ", INT_5 = " + INT_5;
  }

  public static void main(String[] args) {
    FinalData fd1 = new FinalData("fd1");
    // fd1.valueOne++;
    fd1.v2.i++;
    fd1.v1 = new Value(9);

    for (int i = 0; i < fd1.a.length; i++) {
      fd1.a[i]++;
    }

    //
    // fd1.v2 = new Value(0);
    // fd1.VAL_3 = new Value(1);
    // fd1.a = new int[3];

    System.out.println(fd1);
    System.out.println("Creating new FinalData");
    FinalData fd2 = new FinalData("fd2");
    System.out.println(fd1);
    System.out.println(fd2);

  }

}
