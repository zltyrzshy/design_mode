package hw05.Observer;

public class Client {
    public static void main(String args[]) {
        TextEditingRegion textEditingRegion = new TextEditingRegion();
        Observer observer1 = new TextInformationArea1();
        Observer observer2 = new TextInformationArea2();
        Observer observer3 = new TextInformationArea3();
        textEditingRegion.addObserver(observer1);
        textEditingRegion.addObserver(observer2);
        textEditingRegion.addObserver(observer3);
        textEditingRegion.getChanged();
    }
}
