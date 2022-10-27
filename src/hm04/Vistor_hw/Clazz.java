package hm04.Vistor_hw;

import java.util.ArrayList;

public class Clazz {
    public ArrayList methodlist= new ArrayList<Method>();
    public ArrayList attributelist= new ArrayList<Attribute>();
    public int rownum=0;
    public String clazzname;
    public Clazz(int rownum,String name){
        this.rownum=rownum;
        this.clazzname=name;
    }
    public void addMethod(Method method){
        this.methodlist.add(method);
    }
    public  void addAttribute(Attribute attribute){
        this.attributelist.add(attribute);
    }

}
