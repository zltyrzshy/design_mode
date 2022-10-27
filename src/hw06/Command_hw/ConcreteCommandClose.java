package hw06.Command_hw;

public class ConcreteCommandClose implements Command{
    private Switch s;
    public ConcreteCommandClose(Switch s){
        this.s = s;
    }
    @Override
    public void execute() {
        s.close();
    }
}
