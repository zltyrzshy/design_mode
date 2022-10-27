package hw05.Observer;

public class TextInformationArea1 implements Observer{
    @Override
    public void update(TextEditingRegion textEditingRegion) {
        System.out.println("输出编辑文本区中出现的单词总数量和字符总数量");
    }
}
