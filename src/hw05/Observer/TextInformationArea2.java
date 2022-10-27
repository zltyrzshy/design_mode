package hw05.Observer;

public class TextInformationArea2 implements Observer {

    @Override
    public void update(TextEditingRegion textEditingRegion) {
        System.out.println("降序显示可编辑文本区中出现的单词以及每个单词出现的次数");
    }
}
