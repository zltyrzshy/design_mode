package hw05.Facade_hw.facade;

public class StoreMedium {
    public String type;
    public StoreMedium(String type){
        this.type =type;
    }
    public void store(String str){
        System.out.println(str +" has been backups in "+this.type);
    }
}
