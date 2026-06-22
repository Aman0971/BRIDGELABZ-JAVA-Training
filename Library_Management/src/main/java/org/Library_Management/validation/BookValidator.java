package org.Library_Management.validation;

import org.Library_Management.model.Book;

import java.util.ArrayList;
import java.util.List;

public class BookValidator implements Validator<Book> {

    public List<String> validate(Book book){
        List<String> errors = new ArrayList<>();
        if(book.getBookId()<0){
          errors.add("Book ID must be positive");
        }
        if(book.getTitle() == null){
            errors.add("Title should not be null or blank.");
        }
        if(book.getAuthor() == null){
            errors.add("Author should not be null or blank");
        }
        if(!book.getIsbn().matches("[0-9]{10,13}")){
            errors.add("Isbn is not valid");
        }
        if(book.getQuantity()<0 && book.getPrice() < 0.0){
            errors.add("Quantity and Price must be positive");
        }
        return errors;
    }
}
