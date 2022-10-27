package hm04.Composite_hw;

public class Client {
    public static void main(String args[]){
        Group group1 = new Group("GROUP1");
        Group group2 = new Group("GROUP2");
        Member member1 = new Member("001");
        group1.add(member1);
        group1.add(new Member("002"));
        group1.add(new Member("003"));
        group1.add(group2);
        group2.add(new Member("004"));
        member1.share(group1,"hello everybody");
    }
}
