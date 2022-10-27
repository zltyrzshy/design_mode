package hm03.Builder_hw;

public class main {
    public static String args ;
    public static void main(String args[]){
        if(args.length!=1){
            usage();
            System.exit(0);
        }
        else if(args[0].equals("Trucks")){
            SystemDirector systemDirector = new SystemDirector(new TrucksBuilder());
            systemDirector.construct();
        }
        else if(args[0].equals("SportsCars")){
            SystemDirector systemDirector = new SystemDirector(new SportsCarsBuilder());
            systemDirector.construct();
        }
        else if(args[0].equals("TrackCrosscountry")){
            SystemDirector systemDirector = new SystemDirector(new TrackCrosscountryBuilder());
            systemDirector.construct();
        }
        else if(args[0].equals("FormulaRacing")){
            SystemDirector systemDirector = new SystemDirector(new FormulaRacingBuilder());
            systemDirector.construct();
        }
        else {
            usage();
            System.exit(0);
        }

    }
    public static void usage(){
        System.out.println("Please enter the car model you want");
    }
}
