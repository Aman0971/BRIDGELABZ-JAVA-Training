package org.Library_Management.library.publiclib.observer;

public class MemberObserver {
    private String notificationMessage;

    public void update(String msg){
       this.notificationMessage = msg;
    }
    public String getNotificationMessage(){
        return notificationMessage;
    }
}
