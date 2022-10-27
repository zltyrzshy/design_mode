package hw06.Interpreter;


import java.util.ArrayList;

public class Client {
    public static void main(String[] args) {
        ArrayList<String> LIST = new ArrayList<>();
        String str1 = "COPY VIEW FROM srcDB TO desDB";
        String str2 = "MOVE TABLE Student FROM srcDB TO desDB";
        String str3 = "MOVE FUNCTION Student FROM srcDB TO desDB";
        LIST.add(str1);
        LIST.add(str2);
        LIST.add(str3);
        for(String str:LIST){
            Context context = new Context(str);
            AbstractDbNode  node = new ExpressionNode();
            node.interpret(context);
            System.out.println(node.execute());
        }
    }
}