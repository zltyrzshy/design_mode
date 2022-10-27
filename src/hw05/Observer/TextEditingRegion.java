package hw05.Observer;

import java.util.ArrayList;
import java.util.Iterator;

public class TextEditingRegion {
    private ArrayList observers = new ArrayList();
    public void addObserver(Observer observer){
        observers.add(observer);
    }
    public void deleteObserver(Observer observer){
        observers.remove(observer);
    }
    public void notifyObserver(){
        Iterator it=observers.iterator();
        while(it.hasNext()){
            Observer o = (Observer)it.next();
            o.update(this);
        }
    }
    public void getChanged(){
        notifyObserver();
    }
}
