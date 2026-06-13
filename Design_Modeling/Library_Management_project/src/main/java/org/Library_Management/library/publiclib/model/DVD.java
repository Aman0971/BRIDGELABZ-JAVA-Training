package org.Library_Management.library.publiclib.model;

public class DVD implements LibraryMedia{
    private String title;
    public DVD(String title){
        this.title = title;
    }
    public String getTitle(){
        return title;
    }
}
