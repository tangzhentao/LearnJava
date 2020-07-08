

class AnImplemention implements AnInterface {

    @Override
    public void firstM () {
        System.out.println("firstM()");
    }

    @Override
    public void secondM () {
        System.out.println("secondM()");
    }

    public static void main(String[] args) { 
        AnInterface i = new AnImplemention();
        i.firstM();
        i.secondM();
        i.newM();

    }
}