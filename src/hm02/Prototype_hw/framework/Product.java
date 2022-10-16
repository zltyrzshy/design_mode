package hm02.Prototype_hw.framework;

public interface Product extends Cloneable{
    void use(String s);
    Product createClone();
    Product createDeepClone();
}
