package hm03.Bridge_hw.Bridge;

public class Display {
    private Displayimpl impl;
    public Display(Displayimpl displayimpl){
        this.impl = displayimpl;
    }
    public void display(){
        this.impl.display();
    }
}
