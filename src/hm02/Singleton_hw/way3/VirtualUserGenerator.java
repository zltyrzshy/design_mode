package hm02.Singleton_hw.way3;


public class VirtualUserGenerator {

    private VirtualUserGenerator() {
        System.out.println(VirtualUserGenerator.class);
    }

    private static class HolderClass {
        private final static VirtualUserGenerator s = new VirtualUserGenerator();
    }

    public static VirtualUserGenerator getInstance() {
        return HolderClass.s;
    }


    public static void main(String[] args) {
        VirtualUserGenerator s = VirtualUserGenerator.getInstance();
    }

}