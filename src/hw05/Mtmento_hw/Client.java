package hw05.Mtmento_hw;

import hw05.Mtmento_hw.Text.Memento;
import hw05.Mtmento_hw.Text.Text;

public class Client {
    public static void main(String args[]){
        Text text = new Text("Text Content");
        for(int i = 0 ;i<10;i++){
            text.ChangeContent();
        }
        text.undoMemento(3);
        System.out.println(text.getContent());
        text.redoMemento(2);
        System.out.println(text.getContent());
    }
}
