
/*
##### 向下转型与运行时类型信息
- is-a
- is-like-a
- 向上转型、向下转型、运行时类型信息
upcaste、downcast、runtime type information
*/

class Usefull {
    public void f() {}
    public void g() {}
}

class MoreUsefull extends Usefull {
    @Override
    public void f() {}
    @Override
    public void g() {}

    public void u() {}
}

public class RTTI {
    public static void main(String[] args) { 
        Usefull[] x = {
            new Usefull(),
            new MoreUsefull()
        };

        x[0].f();
        x[1].g();
        // x[1].u(); // 编译时错误

        ( (MoreUsefull) x[1] ).u(); // 向下转型 downcast
        ( (MoreUsefull) x[0] ).u(); // 运行时错误：类转型异常 lassCastException
        // Usefull cannot be cast to MoreUsefull
    }
}