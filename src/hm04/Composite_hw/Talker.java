package hm04.Composite_hw;

public abstract class Talker {
    public abstract String getName();
    public abstract  void accept(String msg,Talker talker);
    public void add(Talker talker) throws FileTreatmentException{
        throw new FileTreatmentException();
    }
    public void share(Talker talker,String msg) throws FileTreatmentException{
        throw new FileTreatmentException();
    }

}
