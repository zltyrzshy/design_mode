package hw06.Command_hw;

import java.util.ArrayList;

public class Invoker {
    public ArrayList<Command> cmdList = new ArrayList<>();
    public void addCmd(Command cmd){
        this.cmdList.add(cmd);
    }
    public void executeCmd(){
        for(Command cmd:this.cmdList){
            cmd.execute();
        }
    }
}
