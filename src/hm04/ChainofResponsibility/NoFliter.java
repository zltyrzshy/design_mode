package hm04.ChainofResponsibility;

public class NoFliter extends Filter{
    @Override
    public boolean resolve(Trouble trouble) {
        System.out.println("this is "+this.getClass().getSimpleName());
        return false;
    }
}
