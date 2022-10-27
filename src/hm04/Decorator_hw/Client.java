package hm04.Decorator_hw;

public class Client {
    public static void main(String[] args) {
        Doc d1 = new ConcreteDoc("shan\n");
        Doc d2 = new HeadDecorator(d1);
        Doc d3 = new TailDecorator(d2);

        Doc d4 = new TailDecorator(new TailDecorator(new HeadDecorator(new TailDecorator(new HeadDecorator(new TailDecorator(d3))))));

        d1.show();
        d2.show();
        d3.show();
        d4.show();
    }
}
