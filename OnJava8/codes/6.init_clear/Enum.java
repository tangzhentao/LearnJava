
// 枚举的用法

enum Spiciness {
  NOT, MILD, MEDIUM, HOT
}

class Enum {
  public static void main(String[] args) {

    Spiciness s1 = Spiciness.MILD;
    printEnum(s1);

    printEnumOrder();

    describe(s1);
  }

  static void printEnum(Spiciness s) {
    System.out.println("s: " + s);
  }

  static void printEnumOrder() {
    for (Spiciness s : Spiciness.values()) {
      System.out.println(s + ", ordinal " + s.ordinal());
    }
  }

  static void describe(Spiciness s) {
    switch (s) {
      case NOT:
        System.out.println("not spicy at all.");
        break;

      case MILD:
      case MEDIUM:
        System.out.println("not spicy at all.");
        break;

      case HOT:
        System.out.println("maybe too hot.");
        break;
    }
  }
}
