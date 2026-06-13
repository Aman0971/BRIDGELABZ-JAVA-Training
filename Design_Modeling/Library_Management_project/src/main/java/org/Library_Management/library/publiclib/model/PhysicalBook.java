package org.Library_Management.library.publiclib.model;
public class PhysicalBook implements LibraryMedia{
    private String title;
    public PhysicalBook(String title){
        this.title = title;
    }
    public String getTitle(){
        return title;
    }

}
