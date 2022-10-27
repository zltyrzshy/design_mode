package hw05.Mtmento_hw.Text;

public class Text {
    private String content;
    private  Memento memento;
    public  Text(String content){
        this.content =content;
        this.memento = new Memento();
    }

    public String getContent() {
        return content;
    }

    public void ChangeContent(){
        this.memento.undoMemento.push(content);
        content=content+'+';
    }

    public Memento getMemento() {
        return memento;
    }

    public void redoMemento(int num){
        String str="";
        for(int i =0;i<num;i++){
            str = memento.redoMemento.peek();
            this.memento.undoMemento.push(str);
            memento.redoMemento.pop();
        }
        this.content = str;
    }
    public void undoMemento(int num){
        String str="";
        for(int i =0;i<num;i++){
            str = memento.undoMemento.peek();
            this.memento.redoMemento.push(str);
            memento.undoMemento.pop();
        }
        this.content = str;
    }

}
