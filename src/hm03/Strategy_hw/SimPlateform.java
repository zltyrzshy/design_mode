package hm03.Strategy_hw;

public class SimPlateform {
    private Strategy strategy;
    public void VirtualMachineMigration(Strategy strategy){
        this.strategy = strategy;
        this.strategy.VirtualMachineMigration();
    }
}
