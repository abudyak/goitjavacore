package module7.homework.task12345.module5Refactored;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TripAdvisorAPI implements API{

    private List<Room> rooms = new ArrayList<>();

    public TripAdvisorAPI() {
        Date date1 = new Date();
        date1.setTime(1474232311);

        Date date2 = new Date();
        date2.setTime(1474232322);

        Date date3 = new Date();
        date3.setTime(1474232333);

        Date date4 = new Date();
        date4.setTime(1474232344);

        Date date5 = new Date();
        date5.setTime(1474232355);

        rooms.add(new Room(1, 400, 2, date1, "GrandHotel", "New York"));
        rooms.add(new Room(2, 200, 2, date2, "Opera Hotel", "Kiev"));
        rooms.add(new Room(3, 300, 2, date3, "GrandHotel", "Paris"));
        rooms.add(new Room(4, 500, 2, date4, "GrandHotel", "Las Vegas"));
        rooms.add(new Room(5, 200, 2, date5, "ParisStar", "Paris"));
    }

    @Override
    public List<Room> findRooms(int price, int persons, String city, String hotel) {
        Room findRoomSample = new Room(price, persons, city, hotel);
        List<Room> foundRooms = new ArrayList<>();

        // find and save rooms
        for (Room r : rooms) {
            if (findRoomSample.equals(r)) {
                foundRooms.add(r);
            }
        }

        // if there is no room then return null Room object
        if (foundRooms.isEmpty()) {
            foundRooms.add(new Room(0, 0, 0, new Date(), "null", "null"));
            return foundRooms;

        }
        return foundRooms;
    }

    @Override
    public List<Room> getAll() {
        return rooms;
    }
}
