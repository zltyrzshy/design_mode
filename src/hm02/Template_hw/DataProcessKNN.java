package hm02.Template_hw;

public class DataProcessKNN extends DataProcess {

    @Override
    String[] classifyData(String data) {
        return data.split(",");
    }
}
