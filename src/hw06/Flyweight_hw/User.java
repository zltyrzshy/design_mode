package hw06.Flyweight_hw;

import java.util.ArrayList;

public class User {
    public ArrayList<String> list;
    public  User(){
        this.list = new ArrayList<>();
    }
    public void addPermissioncode(String permission){
        this.list.add(permission);
    }
    public void print(BusinessFactory businessFactory){
        System.out.println("Information has been verificated");
        for(String str : list){
            System.out.println(businessFactory.getBusiness(str).getBusinessObject());
        }

    }
}
