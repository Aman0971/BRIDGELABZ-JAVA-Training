package org.Hotel_Management.io;

import org.Hotel_Management.model.Room;
import org.Hotel_Management.validation.RoomValidator;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CsvHandler {

    public static List<Room> readRoomsFromCsv(String filePath) {

        List<Room> rooms = new ArrayList<>();

        RoomValidator validator = new RoomValidator();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            String line;

            br.readLine();

            while ((line = br.readLine()) != null) {

                try {

                    String[] data = line.split(",");

                    Room room = new Room(Integer.parseInt(data[0]), data[1], Double.parseDouble(data[2]), Boolean.parseBoolean(data[3]));

                    if (validator.validate(room).isEmpty()) {

                        rooms.add(room);
                    }

                } catch (NumberFormatException e) {

                    System.out.println("Invalid Row : " + line);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return rooms;
    }

    public static void writeRoomsToCsv(String filePath, List<Room> rooms) {

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {

            // Header
            bw.write("RoomNumber,Type,PricePerNight,IsAvailable");
            bw.newLine();
            // Data
            for (Room room : rooms) {

                bw.write(room.getRoomNumber() + "," + room.getType() + "," + room.getPricePerNight() + "," + room.isAvailable());

                bw.newLine();
            }

            System.out.println("Rooms written successfully.");

        } catch (IOException e) {

            e.printStackTrace();
        }
    }
}
