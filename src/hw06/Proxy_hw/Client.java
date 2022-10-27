package hw06.Proxy_hw;

public class Client {
    public static void main(String[] args) {
        FirstStorage firstStorage = new FirstStorage();
        SecondaryStorage secondaryStorage = new SecondaryStorage();
        firstStorage.addData("key1","value1");
        firstStorage.addData("key2","value2");
        secondaryStorage.addData("key1","value1");
        secondaryStorage.realize(firstStorage);
        secondaryStorage.requestData("key1");
        secondaryStorage.requestData("key2");
        secondaryStorage.requestData("key2");
    }
}
