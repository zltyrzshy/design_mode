package hw05.Observer;

public class TextInformationArea3 implements Observer{
    @Override
    public void update(TextEditingRegion textEditingRegion) {
        System.out.println("显示可编辑" + "文本区中出现的单词（去重后按照字典序排序）");
    }
}
