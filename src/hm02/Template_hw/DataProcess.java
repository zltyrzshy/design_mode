package hm02.Template_hw;

public abstract class DataProcess {
    private String data = "";
    private String[] dataRow;
    private String[] result;


    private void readData(String[] dataRaw) {
        this.dataRow = dataRaw;
    }

    private void convertData() {
        for (String s : dataRow) {
            this.data = this.data.concat(s);
        }
    }

    abstract String[] classifyData(String data);

    private void printResult() {
        for (String s : result) {
            System.out.println(s);
        }
        System.out.println();
    }

    final void dataProcess(String[] dataRow) {
        readData(dataRow);
        convertData();
        this.result = classifyData(this.data);
        printResult();
    }
}
