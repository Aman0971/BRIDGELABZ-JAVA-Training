package org.Library_Management.library.publiclib.factory;

public class AdultWelcomePackFactory implements WelcomePackFactory{
    public String createCardType(){
        return "StandardCard";
    }
    public String createGift(){
        return "BookPass";
    }
}
