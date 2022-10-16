package hm02.Template_hw;

public class DataProcessDecisionTree extends DataProcess {
    @Override
    String[] classifyData(String data) {
        return data.split(":");
    }
}
