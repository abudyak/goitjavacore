package module7.homework.task12345.module5Refactored;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BookingComAPI implements API {

    private List<Room> rooms = new ArrayList<>();

    public BookingComAPI() {
        rooms.add(new Room(1, 400, 2, new Date(1474232311), "GrandHotel", "New York"));
        rooms.add(new Room(2, 200, 2, new Date(1474232322), "GrandHotel", "Kiev"));
        rooms.add(new Room(3, 300, 2, new Date(1574232344), "HotelPlus", "Paris"));
        rooms.add(new Room(4, 500, 2, new Date(), "GrandHotel", "Las Vegas"));
        rooms.add(new Room(5, 200, 1, new Date(), "GrandHotel", "Tokyo"));
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
