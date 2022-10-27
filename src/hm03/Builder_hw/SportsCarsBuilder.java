package hm03.Builder_hw;

public  class SportsCarsBuilder extends CarBuilder {
    @Override
    public void makeBody() {
        System.out.println("this is"+this.getClass().getSimpleName()+"Body");
    }

    @Override
    public void makeEngine() {
        System.out.println("this is"+this.getClass().getSimpleName()+"Engine");
    }

    @Override
    public void makeTire() {
        System.out.println("this is"+this.getClass().getSimpleName()+"Tire");
    }

    @Override
    public void makegearbox() {
        System.out.println("this is"+this.getClass().getSimpleName()+"gearbox");
    }
}