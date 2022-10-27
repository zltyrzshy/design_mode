package hw06.Proxy_hw;

import java.util.HashMap;

public class FirstStorage implements Storage {
    private HashMap<String,String> map = new HashMap<>();
    @Override
    public String requestData(String str) {
        System.out.println(str+" in the FirstStorage");
        return map.get(str);
    }

    public void addData(String str1,String str2){
        map.put(str1, str2);
    }
}
