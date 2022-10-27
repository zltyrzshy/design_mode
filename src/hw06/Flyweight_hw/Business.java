package hw06.Flyweight_hw;

import lombok.Getter;

public class Business {
    @Getter
    private String businessObject;

    public Business(String str){
        this.businessObject= "||||"+str+"||||";
    }

}
