package hw05.Facade_hw.facade;

public class Facade {
    private Facade(){}
    public static void backups(String Storage){
        StoreMedium storage=new StoreMedium(Storage);
        new SMSManagement().SMSBackups(storage);
        new AddressBookManagement().AddressBookBackups(storage);
        System.out.println("操作已完成");
    }
}
