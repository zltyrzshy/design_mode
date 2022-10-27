package hm04.Vistor_hw;

import java.util.Iterator;

public class ListVisitor extends Visitor{
    public void visitScale(srcCode code){
        Iterator iterator = code.clazzes.iterator();
        int i = 0;
        while(iterator.hasNext()){
            i++;
            Clazz clazz = (Clazz) iterator.next();
            System.out.println(clazz.clazzname+"'s method number is"+clazz.methodlist.size());
            System.out.println(clazz.clazzname+"'s attributes number is"+clazz.attributelist.size());
        }
        System.out.println("class's number is"+i);

    }
    public void visitName(srcCode code){
        Iterator iterator = code.clazzes.iterator();
        while(iterator.hasNext()){
            Clazz clazz = (Clazz) iterator.next();
            System.out.println("this class's" +"name is"+ clazz.clazzname);
            Iterator iterator1 = clazz.methodlist.iterator();
            while ((iterator1.hasNext())) {
                Method method = (Method) iterator1.next();
                System.out.println("this method's" +"name is"+ method.methodName);
;            }
            Iterator iterator2 = clazz.attributelist.iterator();
            while ((iterator2.hasNext())) {
                Attribute attribute = (Attribute) iterator2.next();
                System.out.println("this Attribute's" +"name is"+ attribute.name);
                ;            }
        }
    }


    public void visitRownum(srcCode code){
        Iterator iterator = code.clazzes.iterator();
        while(iterator.hasNext()){
            Clazz clazz = (Clazz) iterator.next();
            System.out.println("this class's" +clazz.clazzname+"row number is"+ clazz.rownum);
            Iterator iterator1 = clazz.methodlist.iterator();
            while ((iterator1.hasNext())) {
                Method method = (Method) iterator1.next();
                System.out.println("this method's" +method.methodName+"row number is"+ method.rownum);
            }
        }
    }
}
