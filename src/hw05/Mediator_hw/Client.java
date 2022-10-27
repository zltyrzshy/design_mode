package hw05.Mediator_hw;

public class Client {
    public static void main(String args[]){
       SystemMediator mediator = new SystemMediator();
        AirportSubsystem airportSubsystem = new AirportSubsystem();
        airportSubsystem.setMediator(mediator);
        mediator.setAirportSubsystem(airportSubsystem);
        mediator.setRavelcompaniessubsystem(new ravelcompaniesSubsystem());
        mediator.setHotelsSubsystem(new HotelsSubsystem());
        mediator.setRestaurantsSubsystem(new RestaurantsSubsystem());
        mediator.setTourismAttractionsSubsystem(new TourismAttractionsSubsystem());
        airportSubsystem.shareMsg("visitorA's info");
    }
}
