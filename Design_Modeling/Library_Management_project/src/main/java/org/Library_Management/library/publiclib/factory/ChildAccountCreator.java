package org.Library_Management.library.publiclib.factory;

public class ChildAccountCreator extends AccountCreator{
    public Account createAccount(){
        return new ChildAccount();
    }
}