package hm03.Builder_hw;

public class main {
    public static String args ;
    public static void main(String args[]){
        if(args.length!=1){
            usage();
            System.exit(0);
        }
        if(args[0].equals("Trucks")){
            Builder.SystemDirector systemDirector = new Builder.SystemDirector(new Builder.TrucksBuilder());
            systemDirector.construct();
        }
        if(args[0].equals("SportsCars")){
            Builder.SystemDirector systemDirector = new Builder.SystemDirector(new Builder.SportsCarsBuilder());
            systemDirector.construct();
        }
        if(args[0].equals("TrackCrosscountry")){
            Builder.SystemDirector systemDirector = new Builder.SystemDirector(new Builder.TrackCrosscountryBuilder());
            systemDirector.construct();
        }
        if(args[0].equals("FormulaRacing")){
            Builder.SystemDirector systemDirector = new Builder.SystemDirector(new Builder.FormulaRacingBuilder());
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
