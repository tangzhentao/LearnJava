
interface AnInterface {
    void firstM();
    void secondM();

    default void newM() {
        System.out.println("newM()");
    }
}