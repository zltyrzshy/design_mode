package hm02.Adapter_hw.classAdapter;

public class EncryptAlgorithm {
    void EncryptAlgorithmA(String name,String psw){
        System.out.println("("+name+")");
        System.out.println("("+psw+")");
    }
    void EncryptAlgorithmB(String name,String psw){
        System.out.println("{"+name+"}");
        System.out.println("{"+psw+"}");
    }
    void EncryptAlgorithmC(String name,String psw){
        System.out.println("["+name+"]");
        System.out.println("["+psw+"]");
    }
}
