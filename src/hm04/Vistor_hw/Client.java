package hm04.Vistor_hw;

public class Client {
    public static void main(String args[]){
        srcCode srcCode = new srcCode();
        Clazz clazz1 = new Clazz(10,"class001");
        Clazz clazz2 = new Clazz(10,"class002");
        Method method1 = new Method(5,"method001");
        Method method2 = new Method(5,"method002");
        Method method3 = new Method(5,"method003");
        Attribute attribute1 = new Attribute("attribute001");
        Attribute attribute2 = new Attribute("attribute002");
        Attribute attribute3 = new Attribute("attribute003");
        clazz1.addAttribute(attribute1);
        clazz1.addAttribute(attribute2);
        clazz2.addAttribute(attribute3);
        clazz1.addMethod(method1);
        clazz1.addMethod(method2);
        clazz2.addMethod(method3);
        srcCode.add(clazz1);
        srcCode.add(clazz2);
        Visitor v = new ListVisitor();
        srcCode.accept_name(v);
        srcCode.accept_rownum(v);
        srcCode.accept_scale(v);

    }
}
