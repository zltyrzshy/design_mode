package hm02.Adapter_hw.classAdapter;

public class DButils {
    private String name;
    private String psw;
    DButils(String name,String psw){
        this.name=name;
        this.psw=psw;
    }
    public void Store_information(){
        targetAlgorithm ta = new EncryptAdapter();
        ta.targetAlgorithm1(this.name,this.psw);
        ta.targetAlgorithm2(this.name,this.psw);
    }
}
