package hm03.Strategy_hw;

public class Client {
    public static void main(String args[]){
        SimPlateform simPlateform = new SimPlateform();
        simPlateform.VirtualMachineMigration(new CRRTMotionStrategy());
        simPlateform.VirtualMachineMigration(new PostCopyStrategy());
        simPlateform.VirtualMachineMigration(new PreCopystrategy());
    }
}
