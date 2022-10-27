package hw05.Mediator_hw;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SystemMediator implements Mediator{
    private ravelcompaniesSubsystem ravelcompaniessubsystem;
    private AirportSubsystem airportSubsystem;
    private HotelsSubsystem hotelsSubsystem;
    private RestaurantsSubsystem restaurantsSubsystem;
    private TourismAttractionsSubsystem tourismAttractionsSubsystem;



    @Override
    public void colleaguesCall(String msg,Colleague colleague) {
        ravelcompaniessubsystem.recMsg(msg,colleague);
        airportSubsystem.recMsg(msg,colleague);
        hotelsSubsystem.recMsg(msg,colleague);
        restaurantsSubsystem.recMsg(msg,colleague);
        tourismAttractionsSubsystem.recMsg(msg,colleague);
    }
}
