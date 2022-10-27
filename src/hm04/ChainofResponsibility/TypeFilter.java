package hm04.ChainofResponsibility;

public class TypeFilter extends Filter {
    @Override
    public boolean resolve(Trouble trouble) {
        System.out.println("this is "+this.getClass().getSimpleName());
        return trouble.getContent().contains("type");

    }
}
