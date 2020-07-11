
// 多接口中，方法冲突

interface I1 {
    void f();
}

interface I2 {
    int f(int i);
}

interface I3 {
    int f();
}

class C {
    public int f() {
        return 1;
    }
}

class C2 implements I1, I2 {
    @Override 
    public void f() {}

    @Override 
    public int f(int i) { // 重载
        return 1;
    }
}

class C3 extends C implements I2 {
    @Override 
    public int f(int i) { // 重载
        return 1;
    }
}

class C4 extends C implements I3 {

    // C中的方法名和 I3中的方法名完全一样，没有问题
    @Override 
    public int f() {
        return 1;
    }
}

// 方法名相同，但返回值类型不一样。不能构成方法重载，不能共存
// class C5 extends C implements I1 {
//     @Override
//     public void f() {}

//     @Override
//     public int f() {}
// }

// 方法名相同，但返回值类型不一样。会出问题
// interface I4 extends I1, I3 {}