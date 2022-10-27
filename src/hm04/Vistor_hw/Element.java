package hm04.Vistor_hw;

public interface Element {
    public void accept_scale(Visitor v);
    public void accept_name(Visitor v);
    public void accept_rownum(Visitor v);
}
