// using finalize() to delete a object that
// hasn't beed properly clearned up

// import onjava.*;
import java.util.concurrent.*;

class Nap {
   Nap(double t) { // Seconds
    try {
      TimeUnit.MILLISECONDS.sleep((int)(1000 * t));
    } catch(InterruptedException e) {
      throw new RuntimeException(e);
    }
  }
   Nap(double t, String msg) {
    this(t);
    System.out.println(msg);
  }
}

class Book {
  boolean checkedOut = false;
  Book(boolean checkout) {
    checkedOut = checkout;
  }

  void checkIn() {
    checkedOut = false;
  }

  @Override
  protected void finalize() throws Throwable {
    if (checkedOut) {
      System.out.println("Error: checked out");
    }
  }
}

public class TerminationCondition {
  public static void main(String[] args) {
    Book novel = new Book(true);
    novel.checkIn();

    new Book(true);

    System.gc();

    new Nap(1);
  }
}
