package hm02.Singleton_hw.way1;

public class VirtualUserGenerator {
    public static VirtualUserGenerator virtualUserGenerator = new VirtualUserGenerator();

    private VirtualUserGenerator() {

    }

    public static VirtualUserGenerator getInstance() {
        return virtualUserGenerator;
    }
}
