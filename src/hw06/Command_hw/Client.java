package hw06.Command_hw;

public class Client {
    public static void main(String[] args) {
        System.out.println("请依次输入五个按键对应的灯");
        Switch s1 = new Switch();
        Switch s2 = new Switch();
        Switch s3 = new Switch();
        Switch s4 = new Switch();
        Switch s5 = new Switch();
        s1.setReceiverLight(new ReceiverLight(args[0]));
        s2.setReceiverLight(new ReceiverLight(args[1]));
        s3.setReceiverLight(new ReceiverLight(args[2]));
        s4.setReceiverLight(new ReceiverLight(args[3]));
        s5.setReceiverLight(new ReceiverLight(args[4]));
        Invoker invoker =new Invoker();
        invoker.addCmd(new ConcreteCommandOpen(s1));
        invoker.addCmd(new ConcreteCommandClose(s1));
        invoker.addCmd(new ConcreteCommandOpen(s2));
        invoker.addCmd(new ConcreteCommandClose(s1));
        invoker.addCmd(new ConcreteCommandOpen(s3));
        invoker.addCmd(new ConcreteCommandClose(s2));
        invoker.addCmd(new ConcreteCommandOpen(s4));
        invoker.executeCmd();
    }
}
