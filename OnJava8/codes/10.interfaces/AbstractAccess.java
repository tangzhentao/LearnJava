
abstract class AbstractAccess {
    private void m1() {}
    // private abstract void m1a(); // 抽象方法不能是私有的

    protected void m2() {}
    protected abstract void m2a();

    void m3() {}
    abstract void m3a();

    public void m4() {}
    public abstract void m4a();
}