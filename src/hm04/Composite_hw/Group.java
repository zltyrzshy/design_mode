package hm04.Composite_hw;

import java.util.ArrayList;
import java.util.Iterator;

public class Group extends Talker{
    public String name;
    public Group(String name){
        this.name=name;
    }
    private ArrayList talkerlist = new ArrayList<Talker>();
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void accept(String msg,Talker talker) {
        Iterator iterator = this.talkerlist.iterator();
        while(iterator.hasNext()){
            Talker talker1 = (Talker) iterator.next();
            talker1.accept(msg,talker);
        }
    }

    @Override
    public void add(Talker talker){
        this.talkerlist.add(talker);
    }

}
