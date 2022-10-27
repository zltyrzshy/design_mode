package hw06.Flyweight_hw;

import java.util.HashMap;

public class BusinessFactory {
    private HashMap<String,Business> pool = new HashMap<String,Business>();
    private static BusinessFactory singleton = new BusinessFactory();
    public  static BusinessFactory getInstance(){
        return singleton;
    }
    public synchronized Business getBusiness(String key){
        Business business = pool.get(key);
        if(business == null){
            business = new Business(key);
            pool.put(key,business);
        }
        return business;
    }

}
