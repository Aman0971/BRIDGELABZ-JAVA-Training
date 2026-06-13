package org.Library_Management.library.publiclib.observer;

import java.util.*;

public class Subject {
    private List<MemberObserver> observers = new ArrayList<>();
    private String latestArrival;

    public void addObserver(MemberObserver obs){
        observers.add(obs);
    }
    public void addNewArrival(String title){
        latestArrival = title;
        notifyObserver();
    }
    public void notifyObserver(){
        String message =  latestArrival;
        for(MemberObserver mo : observers){
            mo.update(message);
        }
    }
}
