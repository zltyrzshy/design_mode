package hm02.Adapter_hw.classAdapter;

public class EncryptAdapter extends EncryptAlgorithm implements  targetAlgorithm{
    EncryptAdapter(){
        super();
    }
    @Override
    public void targetAlgorithm1(String name,String psw) {
        EncryptAlgorithmA(name,psw);
    }

    @Override
    public void targetAlgorithm2(String name,String psw) {
        EncryptAlgorithmC(name,psw);
    }
}
