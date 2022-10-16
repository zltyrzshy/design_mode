package hm02.Prototype_hw.framework;

import java.util.HashMap;

public class Manager {
    private HashMap<String, Product> showCase = new HashMap<>();

    public void register(String name, Product product) {
        showCase.put(name, product);
    }

    public Product create(String name){
        return showCase.get(name).createClone();
    }
}
