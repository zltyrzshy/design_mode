package hw06.State_hw;

public class Established implements State{

    @Override
    public void reaction() {
        System.out.println(this.getClass().getSimpleName());
    }
}
