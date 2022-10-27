package hw06.State_hw;

public class TCP {
    private State state;
    public void changeState(State state){
        this.state = state;
    }
    public void doReaction(){
        this.state.reaction();
    }
}
