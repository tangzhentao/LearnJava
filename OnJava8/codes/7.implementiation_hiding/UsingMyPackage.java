
// 使用自己写的包

import mypackage.MyClass;
// import com.im.simple.List;
// import com.im.simple.Vector;
import com.im.simple.*;
import java.util.*; // 制造类名冲突

class UsingMyPackage {
  public static void main(String[] args) {
    mypackage.MyClass obj = new mypackage.MyClass();
    obj.greet();

    MyClass obj1 = new MyClass();
    obj1.greet();

    java.util.Vector v = new java.util.Vector();

    com.im.simple.List l = new com.im.simple.List();
  }
}
