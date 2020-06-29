
// blank final 空白final
// 空白final是在定义时没有初始化的变量
// 在使用前，必须初始化

class Poppet {
  private int i;

  Poppet(int ii) {
    i = ii;
  }
}

public class BlankFinal {
  private final int i = 0; // 定义时初始化
  private final int j; // 定义时没有初始化
  private final Poppet p;

  public BlankFinal() {
    j = 1;
    p = new Poppet(1);
  }

  public BlankFinal(int x) {
    j = x;
    p = new Poppet(47);
  }

  public BlankFinal(String x) {
    p = new Poppet(2);
  }

  public static void main(String[] args) {
    new BlankFinal();
    new BlankFinal(47);

    new BlankFinal("47");

  }
}
