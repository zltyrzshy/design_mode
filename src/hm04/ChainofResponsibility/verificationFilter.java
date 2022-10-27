package hm04.ChainofResponsibility;

public class verificationFilter extends Filter {
    @Override
    public boolean resolve(Trouble trouble) {
        System.out.println("this is "+this.getClass().getSimpleName());
        System.out.println(trouble.getContent().contains("verification"));
        return trouble.getContent().contains("verification");
    }
}
