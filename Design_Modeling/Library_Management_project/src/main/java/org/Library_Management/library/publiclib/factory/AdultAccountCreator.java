package org.Library_Management.library.publiclib.factory;

public class AdultAccountCreator extends AccountCreator{
    public Account createAccount(){
        return new AdultAccount();
    }
}
