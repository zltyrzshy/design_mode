package hm04.ChainofResponsibility;

public class Client {
    public static void main(String[] args) {
        Filter f1 = new NoFliter();
        Filter f2 = new CodeFilter();
        Filter f3 = new TypeFilter();
        Filter f4 = new verificationFilter();
        f1.setNext(f2).setNext(f3).setNext(f4);
        f1.support(new Trouble("verification"));
    }
}
