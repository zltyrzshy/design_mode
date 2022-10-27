package hw06.Proxy_hw;

import java.util.HashMap;

public class SecondaryStorage implements Storage {
    private  FirstStorage firstStorage;
    private HashMap<String,String> map = new HashMap<>();
    @Override
    public String requestData(String str) {
        if(map.containsKey(str)&&map.get(str)!=null){
            System.out.println(str+" in the Secondary Storage");
            return map.get(str);
        }
        else{
            String value=this.firstStorage.requestData(str);
            map.put(str,value);
            return value;
        }
    }

    public void addData(String str1,String str2){
        map.put(str1, str2);
    }

    public void realize(FirstStorage firstStorage){
        this.firstStorage =firstStorage;
    }
}
