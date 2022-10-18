package hm03.Strategy_hw;

public class CRRTMotionStrategy implements  Strategy{
    @Override
    public void VirtualMachineMigration() {
        System.out.println("Successfully finish VirtualMachineMigration by "+this.getClass().getSimpleName() );
    }
}
