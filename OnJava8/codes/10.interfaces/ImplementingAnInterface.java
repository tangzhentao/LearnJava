
// 实现一个接口

interface Concept {
    void idea1 ();
    void idea2();
}

class Implementation implements Concept {
    @Override
    public void idea1 () {
        System.out.println("idea1");
    }

    @Override
    public void idea2 () {
        System.out.println("idea2");
    }
}