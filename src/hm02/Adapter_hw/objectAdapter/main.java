package hm02.Adapter_hw.objectAdapter;

public class main {
    public static  void main(String args[]){
        DButils db = new DButils("user1","psw1");
        db.Store_information();
    }
}
