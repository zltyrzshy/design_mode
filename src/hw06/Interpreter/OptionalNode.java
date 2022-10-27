package hw06.Interpreter;

public class OptionalNode implements AbstractDbNode {
    private String option;  //操作对象
    private String optionname;  //操作对象名称
    private String target;
    @Override
    public void interpret(Context context) {
        option = context.currentToken();
        context.skipToken(option);
        //option的类型可以有各种，表，视图，函数，序列，触发器等等。
        if("VIEW".equals(option)){
            optionname = "视图";
        }else if("TABLE".equals(option)){
            optionname = "表";
        }else if("FUNCTION".equals(option)){
            optionname = "函数";
        }else{
            optionname = "无法识别命令";
        }
        target = context.currentToken();
        if("FROM".equals(target)){
            target = "";
        }else{
            context.skipToken(target);
        }
    }

    @Override
    public String execute() {
        return optionname + target;
    }
}
