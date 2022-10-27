package hw06.Interpreter;

public interface AbstractDbNode {
    void interpret(Context context);
    String execute();
}
