package hw05.Mediator_hw;

public interface Colleague {
    public abstract void setMediator(Mediator mediator);
    public abstract void shareMsg(String msg);
    public abstract  void recMsg(String msg,Colleague c);
}

