package hm02.Singleton_hw.way2;

import java.util.Arrays;

public class VirtualUserGenerator {
    private static volatile VirtualUserGenerator single = null;

    private VirtualUserGenerator() {
    }

    public static VirtualUserGenerator getInstance() {
        if (single == null) {
            synchronized (VirtualUserGenerator.class) {
                if (single == null) {
                    single = new VirtualUserGenerator();
                }
            }
        }
        return single;
    }

    public static void main(String[] args) {
        Thread[] th = new Thread[100];
        for (int i = 0; i < th.length; i++) {
            th[i] = new Thread(() -> System.out.println(VirtualUserGenerator.getInstance().hashCode()));
        }
        Arrays.asList(th).forEach(Thread::start);
    }
}
