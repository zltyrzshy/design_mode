package hm03.Builder_hw;

public class Builder {
    public abstract static class CarBuilder {
        public abstract void makeBody();
        public abstract void makeEngine();
        public abstract void makeTire();
        public abstract void makegearbox();
    }

    public static class FormulaRacingBuilder extends CarBuilder {
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

    public static class SportsCarsBuilder extends CarBuilder {
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

    public static class SystemDirector {
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

    public static class TrackCrosscountryBuilder extends CarBuilder {
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

    public static class TrucksBuilder extends CarBuilder {
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
}
