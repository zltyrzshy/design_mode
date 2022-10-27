package hw06.Flyweight_hw;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        User user1 = new User();
        BusinessFactory businessFactory = BusinessFactory.getInstance();
        user.addPermissioncode("business001");
        user.addPermissioncode("business002");
        user1.addPermissioncode("business001");
        user1.addPermissioncode("business002");
        user.print(businessFactory);
        user.print(businessFactory);
    }
}
