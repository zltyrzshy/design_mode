package hm03.Builder_hw;

public  class SystemDirector {
    private CarBuilder carBuilder;
    public SystemDirector(CarBuilder carBuilder){
        this.carBuilder = carBuilder;
    }
    public void construct(){
        carBuilder.makeBody();
        carBuilder.makeEngine();
        carBuilder.makeTire();
        carBuilder.makegearbox();
        System.out.println("this is your car");
    }
}

