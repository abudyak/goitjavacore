package module5.homework.task1234567;


import java.util.Date;


public class BookingComAPI implements API {

    private Room[] rooms = new Room[5];

    public BookingComAPI() {
        Date date1 = new Date(1474232311);
        date1.setTime(1474232311);

        Date date2 = new Date(1474232322);
        date2.setTime(1474232322);

        Date date3 = new Date(1574232344);
        date3.setTime(1474232333);

        Date date4 = new Date();
        date2.setTime(1474232322);

        Date date5 = new Date();
        date5.setTime(1574232344);

        rooms[0] = new Room(1, 400, 2, date1, "GrandHotel", "New York");
        rooms[1] = new Room(2, 200, 2, date2, "GrandHotel", "Kiev");
        rooms[2] = new Room(3, 300, 2, date3, "HotelPlus", "Paris");
        rooms[3] = new Room(4, 500, 2, date4, "GrandHotel", "Las Vegas");
        rooms[4] = new Room(5, 200, 1, date5, "GrandHotel", "Tokyo");

    }

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        Room findRoomSample = new Room(price, persons, city, hotel);

        // count equal rooms
        int counter = 0;
        for (Room r : rooms) {
            if (findRoomSample.equals(r)) {
                counter++;
            }
        }

        // save found rooms
        if (counter > 0) {
            Room[] foundRooms = new Room[counter];

            int j = 0;
            for (Room r : rooms) {
                if (findRoomSample.equals(r)) {
                    foundRooms[j] = r;
                    j++;
                }
            }
            return foundRooms;

        } else {
            // if no rooms then return null Room object
            Room[] foundRooms = new Room[1];
            foundRooms[0] = new Room(0, 0, 0, new Date(), "null", "null");

            return foundRooms;
        }
    }

    @Override
    public Room[] getAll() {
        return rooms;
    }

}

