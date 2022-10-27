package hw06.Command_hw;

public class ReceiverLight {
    public String name;
    public ReceiverLight(String name){
        this.name = name;
    }
    public void open(){
        System.out.println(name + " has been opened");
    }
    public void close(){
        System.out.println(name + " has been closed");
    }

}
