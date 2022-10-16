package hm02.Adapter_hw.objectAdapter;

public class EncryptAdapter extends targetAlgorithm {
    private EncryptAlgorithm ea;
    EncryptAdapter(){
        super();
        this.ea = new EncryptAlgorithm();
    }
    @Override
    public void targetAlgorithm1(String name,String psw) {
        ea.EncryptAlgorithmA(name,psw);
    }

    @Override
    public void targetAlgorithm2(String name,String psw) {
        ea.EncryptAlgorithmC(name,psw);
    }
}
