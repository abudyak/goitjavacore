package module5.homework.task1234567;


import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;


public class GoogleAPI implements API {

    private Room[] rooms;

    public GoogleAPI() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2016, 01, 10, 13, 00);
        Date date1 = calendar.getTime();

        calendar.set(2016, 02, 10, 13, 00);
        Date date2 = calendar.getTime();

        calendar.set(2016, 02, 11, 13, 00);
        Date date3 = calendar.getTime();

        calendar.set(2016, 02, 12, 13, 00);
        Date date4 = calendar.getTime();

        calendar.set(2016, 02, 7, 13, 00);
        Date date5 = calendar.getTime();

        Room room1 = new Room(1L, 400, 2, date1, "GrandHotel", "New York");
        Room room2 = new Room(2L, 10000, 2, date2, "Royal Congress Hotel", "Kiev");
        Room room3 = new Room(3L, 300, 2, date3, "GrandHotel", "London");
        Room room4 = new Room(4L, 500, 2, date4, "GrandHotel", "Las Vegas");
        Room room5 = new Room(5L, 200, 2, date5, "GrandHotel", "Tokyo");

        rooms = new Room[]{room1, room2, room3, room4, room5};
    }

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        Room findRoomSample = new Room(0L, price, persons, Calendar.getInstance().getTime(), hotel, city);
// variant 1
        Room[] result = new Room[0];

        for (Room room : rooms) {
            if (room.equals(findRoomSample)) {
                result = Arrays.copyOf(result, result.length + 1);
                result[result.length - 1] = room;
            }
        }
        return result;

//        // count equal rooms
//        int counter = 0;
//        for (Room r : rooms) {
//            if (findRoomSample.equals(r)) {
//                counter++;
//            }
//        }
//
//        // save found rooms
//        if (counter > 0) {
//            Room[] foundRooms = new Room[counter];
//
//            int j = 0;
//            for (Room r : rooms) {
//                if (findRoomSample.equals(r)) {
//                    foundRooms[j] = r;
//                    j++;
//                }
//            }
//            return foundRooms;
//
//        } else {
//            // if no rooms then return null Room object
//            Room[] foundRooms = new Room[1];
//            foundRooms[0] = new Room(0, 0, 0, new Date(), "null", "null");
//
//            return foundRooms;
//        }
    }

    @Override
    public Room[] getAll() {
        return rooms;
    }
}
