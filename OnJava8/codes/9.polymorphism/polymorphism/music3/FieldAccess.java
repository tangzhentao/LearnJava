
//  演示 成员变量 不能多态

class Super {
    public int field = 0;

    public int getField () {
        return field;
    }
}

class Sub extends Super {
    public int field = 1;

    @Override
    public int  getField () {
        return field;
    }

    int getSuperField () {
        return super.field;
    }
}

public class FieldAccess {
    public static void main(String[] args) { 
        Super sp = new Sub();
        System.out.println("sp.field = " + sp.field + ", sp.getField = " + sp.getField());

        Sub sb = new Sub();
        System.out.println("sb.field = " + sb.field + ", sb.getField = " + sb.getField() + ", sb.getSuperField = " + sb.getSuperField());
     }
}