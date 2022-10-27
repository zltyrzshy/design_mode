package hm04.Decorator_hw;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ConcreteDoc extends Doc {

    private String content;

    @Override
    public String getContent() {
        return content;
    }
}
