package hw05.Facade_hw.facade;

public class AddressBookManagement {
    public void AddressBookBackups(StoreMedium storeMedium){
        storeMedium.store("AddressBook");
    }
}
