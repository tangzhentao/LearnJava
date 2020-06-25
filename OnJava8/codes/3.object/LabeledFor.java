
public class LabeledFor {
  public static void main(String[] args) {

    outer:
    for (int i = 0; i < 10; i++)
    {
      System.out.println("********");
      for (int j = 0; j < 12; j++)
      {
        if (j % 2 == 0)
          continue;
         if (j == 9) {
           System.out.println("-------");
           continue outer;
         }
         System.out.printf("i = %d, j = %d\n", i, j);
      }


    }

  }
}
