package hw06.Interpreter;


public class OperateNode implements AbstractDbNode {
    private String operate; //动作
    private String opname;  //动作名称

    @Override
    public void interpret(Context context) {
        operate = context.currentToken();
        context.skipToken(operate);
        if("COPY".equals(operate)){
            opname = "复制";
        }else if("MOVE".equals(operate)){
            opname = "移动";
        }else{
            opname = "无法识别命令";
        }
    }

    @Override
    public String execute() {
        return opname;
    }
}

