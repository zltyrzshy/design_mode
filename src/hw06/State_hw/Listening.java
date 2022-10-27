package hw06.State_hw;

public class Listening implements State{
    @Override
    public void reaction() {
        System.out.println(this.getClass().getSimpleName());
    }
}
