package hm03.AbstractFactory.factory;

import hm03.AbstractFactory.listfactory.MySQL;
import hm03.AbstractFactory.listfactory.Oracle;

public abstract class Factory {
    public static Factory getFactory(String classname){
        Factory factory = null;
        try {
            factory = (Factory) Class.forName(classname).getDeclaredConstructor().newInstance();
        }catch (ClassNotFoundException e){
            System.err.println("没有找到"+classname+"类。");
        }catch (Exception e){
            e.printStackTrace();
        }
        return factory;
    }
    public abstract Statement createStatement();
    public abstract Connection createConnection();
}
