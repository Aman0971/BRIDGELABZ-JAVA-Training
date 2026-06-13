package org.Library_Management.library.publiclib.factory;

import org.Library_Management.library.publiclib.model.LibraryMedia;
import org.Library_Management.library.publiclib.model.PhysicalBook;
import org.Library_Management.library.publiclib.model.DVD;

public class MediaFactory {
    public static LibraryMedia createMedia(String type, String title){
        if(type.equalsIgnoreCase("PhysicalBook")){
           return  new PhysicalBook(title);
        }
        if(type.equalsIgnoreCase("DVD")){
            return new DVD(title);
        }
        throw new IllegalArgumentException("invalid types");
    }
}
