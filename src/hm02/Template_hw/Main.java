package hm02.Template_hw;

import java.util.ArrayList;
import java.util.List;

public class Main {

    private static final List<String[]> dataRaws = new ArrayList<>();

    public static void main(String[] args) {
        dataRaws.add(new String[]{"Alice in Garden", "robert:root", "as", "asd,@d", "pass"});
        DataProcess dp1 = new DataProcessNaiveBayes();
        DataProcess dp2 = new DataProcessKNN();
        DataProcess dp3 = new DataProcessDecisionTree();
        for (String[] dataRaw : dataRaws) {
            System.out.println(dataRaws + "\n");

            dp1.dataProcess(dataRaw);
            dp2.dataProcess(dataRaw);
            dp3.dataProcess(dataRaw);


        }
    }
}
