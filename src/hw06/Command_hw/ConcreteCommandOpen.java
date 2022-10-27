package hw06.Command_hw;

public class ConcreteCommandOpen implements Command{
    private Switch aSwitch;
    public ConcreteCommandOpen(Switch aSwitch){
        this.aSwitch = aSwitch;
    }
    @Override
    public void execute() {
        aSwitch.open();
    }
}
