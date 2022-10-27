package hw05.Facade_hw;

import hw05.Facade_hw.facade.Facade;

public class Client {
    public static void main(String args[]){
        System.out.println("请输入你要存储到哪里 MMC OR SD");
        Facade.backups(args[0]);
    }
}
