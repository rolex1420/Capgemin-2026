package AbFactory;

public class Client {

    static void main(String[] args) {
        AbsFactory f=new AbsFactory();
        AbsFactory.getFactory("toyota").getCar("inova").speed();
    }
}
