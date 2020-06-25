import java.util.*;

class ArrayClassObj {
  public static void main(String[] args) {
    Integer [] a;
    Random rand = new Random(47);
    a = new Integer[rand.nextInt(20)];
    System.out.println("array len: " + a.length);

    for (int i = 0; i < a.length; i++) {
      a[i] = rand.nextInt(500); // 自动包装成对象
    }

    System.out.println(Arrays.toString(a));


    // 用花括号列表初始化数组

    Integer [] b = {
      1, 2, // 自动包装成对象
      3,
      4
    };

    Integer [] c = new Integer[] {
      5, 6,
      7,
    };
    System.out.println("b:" + Arrays.toString(b));
    System.out.println("c:" + Arrays.toString(c));

    // 数组作为参数
    display(new String[] {"jim", "tim", "tom"});

  }

  static void display(String[] names) {
    for (String name : names) {
      System.out.print(name + " ");
    }
    System.out.println("");
  }
}
