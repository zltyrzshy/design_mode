package hm04.Composite_hw;

public class Member extends Talker {
    private String name;
    public Member(String name){
        this.name=name;
    }
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void accept(String msg,Talker talker) {
        System.out.println(this.getName()+" get "+msg+" from "+talker.getName());
    }

    @Override
    public void share(Talker talker,String msg){
        talker.accept(msg,this);
    }
}
