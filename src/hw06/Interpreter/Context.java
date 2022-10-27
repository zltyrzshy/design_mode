package hw06.Interpreter;

import java.util.StringTokenizer;

public class Context {
    public StringTokenizer tokenizer;
    public String currentToken;

    public Context(String test) {
        tokenizer = new StringTokenizer(test);
        nextToken();
    }

    public String nextToken() {
        if(tokenizer.hasMoreTokens()){
            currentToken = tokenizer.nextToken();
        }else{
            currentToken = null;
        }
        return currentToken;
    }

    public String currentToken() {
        return currentToken;
    }

    public void skipToken(String token){
        if(!token.equals(currentToken)){
            System.out.println("错误：" + currentToken + "解释错误！");
        }
        nextToken();
    }

}
