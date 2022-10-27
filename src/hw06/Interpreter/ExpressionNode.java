package hw06.Interpreter;


import java.util.ArrayList;
import java.util.List;

public class ExpressionNode implements AbstractDbNode {
    private List<AbstractDbNode> nodes = new ArrayList<>();

    @Override
    public void interpret(Context context) {
        while (true){
            if(context.currentToken() == null){
                break;
            }else{
                AbstractDbNode node = new OptionNode();
                node.interpret(context);
                nodes.add(node);
            }
        }
    }

    @Override
    public String execute() {
        String result = "";
        for (AbstractDbNode node : nodes) {
            result += node.execute();
        }
        return result;
    }
}