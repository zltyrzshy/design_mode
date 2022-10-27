package hm04.Vistor_hw;

import java.util.ArrayList;

public class srcCode implements Element{
    public ArrayList clazzes= new ArrayList<Clazz>();
    public void add(Clazz clazz){
        clazzes.add(clazz);
    }
    public void accept_scale(Visitor v){
        v.visitScale(this);
    }
    public void accept_name(Visitor v){
        v.visitName(this);
    }
    public void accept_rownum(Visitor v){
        v.visitRownum(this);
    }
}
