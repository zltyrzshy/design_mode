package hw06.State_hw;

public class Client {
    public static void main(String[] args) {
        TCP tcp = new TCP();
        tcp.changeState(new Established());
        tcp.doReaction();
        tcp.changeState(new Listening());
        tcp.doReaction();
        tcp.changeState(new Closed());
        tcp.doReaction();
    }
}
