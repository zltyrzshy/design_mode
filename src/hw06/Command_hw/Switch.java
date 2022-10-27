package hw06.Command_hw;

import lombok.Getter;
import lombok.Setter;

public class Switch {
    @Getter
    @Setter
    private ReceiverLight receiverLight;
    public void open(){
        this.receiverLight.open();
    }
    public void close(){
        this.receiverLight.close();
    }
}
