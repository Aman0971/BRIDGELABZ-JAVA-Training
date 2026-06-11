package Design_Patterns;

import java.util.*;

interface Observer {       // Defines an interface with an update() method to ensure all observers receive updates consistently.
    void update(int temprature);
}
  
interface Subject {                /* Defines an interface with methods to manage observers and notify them of updates. */
    void addObserver(Observer o);     

    void removeObserver(Observer o);

    void notifyObservers();
}
                                                
class WeatherStation implements Subject {     /*Ye actual object hai jiske state changes hote hain. */
    private List<Observer> ob = new ArrayList<>();   //observer store krne. Aur bahr se koi khali na kr de isliye private.
    private int temprature;      //isko koi bhi class access krke change na krde isliye private. sirf setTemprature se change ho.

    public void addObserver(Observer o) {
        ob.add(o);
    }

    public void removeObserver(Observer o) {
        ob.remove(o);
    }

    public void notifyObservers() {
        for (Observer observers : ob) {
            observers.update(temprature);
        }
    }

    public void setTemprature(int temprature) {
        this.temprature = temprature;
        notifyObservers();
    }
}

class MobileDisplay implements Observer {     //Ye notification receive karegaaur display krega.
    public void update(int temprature) {
        System.out.println("Temprature updated on Mobile: " + temprature);
    }
}

class TVDisplay implements Observer {         //Ye bhi notification receive karegaaur display krega.
    public void update(int temprature) {
        System.out.println("Temprature updated on TV: " + temprature);
    }
}

public class Behavioral_ObserverPattern {
    public static void main(String[] args) {
        WeatherStation ws = new WeatherStation();
        MobileDisplay mob = new MobileDisplay();
        TVDisplay tv = new TVDisplay();

        ws.addObserver(mob);
        ws.addObserver(tv);

        ws.setTemprature(30);
        System.out.println("Weather updated:");
        ws.removeObserver(mob);
        ws.setTemprature(35);

    }
}
