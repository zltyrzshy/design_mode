package hw05.Mediator_hw;

public class TourismAttractionsSubsystem  implements Colleague{
    private Mediator mediator;
    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void shareMsg(String msg) {
        mediator.colleaguesCall(msg,this);
    }

    @Override
    public void recMsg(String msg, Colleague c) {
        if(!c.getClass().getSimpleName().equals(this.getClass().getSimpleName()))
            System.out.println(this.getClass().getSimpleName()+"receive this visitor's msg ("+ msg +") from "+ c.getClass().getSimpleName());
    }
}
