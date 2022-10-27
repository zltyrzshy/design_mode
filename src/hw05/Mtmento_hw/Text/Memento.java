package hw05.Mtmento_hw.Text;

import java.util.Stack;

public class Memento {
    Stack<String> undoMemento ;
    Stack<String> redoMemento ;

    protected Memento(){
        this.undoMemento = new Stack<String>();
        this.redoMemento = new Stack<String>();
    }

}
