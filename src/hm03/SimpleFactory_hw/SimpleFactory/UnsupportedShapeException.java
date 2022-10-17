package hm03.SimpleFactory_hw.SimpleFactory;

public class UnsupportedShapeException extends  Exception{
    private String msg;
    public UnsupportedShapeException(String msg){
        super(msg);
        this.msg =msg;
    }
}
