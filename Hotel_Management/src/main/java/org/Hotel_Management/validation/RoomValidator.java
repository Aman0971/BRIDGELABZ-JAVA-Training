package org.Hotel_Management.validation;

import org.Hotel_Management.model.Room;

import java.util.ArrayList;
import java.util.List;


public class RoomValidator implements Validator<Room> {
    public List<String> validate(Room room){
        List<String> errors = new ArrayList<>();

        if(room.getRoomNumber() <= 0){
           errors.add("Room must be positive");
        }
        if(room.getPricePerNight() <= 0.0){
            errors.add("Price should be positive");
        }

        String type = room.getType();
        if (type == null ||
                !(type.equals("Single") ||
                        type.equals("Double") ||
                        type.equals("Suite"))) {

            errors.add("Room Type must be Single, Double, or Suite.");
        }
        return errors;
    }
}
