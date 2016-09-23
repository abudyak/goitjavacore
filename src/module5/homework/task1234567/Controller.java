package module5.homework.task1234567;


public class Controller {

    private API[] apis = new API[3];

    public Controller() {
        BookingComAPI bookingComAPI = new BookingComAPI();
        GoogleAPI googleAPI = new GoogleAPI();
        TripAdvisorAPI tripAdvisorAPI = new TripAdvisorAPI();

        apis[0] = bookingComAPI;
        apis[1] = googleAPI;
        apis[2] = tripAdvisorAPI;
    }

    public Room[] requestRooms(int price, int persons, String city, String hotel) {
        // count found rooms of all api
        int counterFoundRooms = 0;
        for (int i = 0; i < apis.length; i++) {
            counterFoundRooms += apis[i].findRooms(price, persons, city, hotel).length;
        }

        // save found rooms of all api
        Room[] foundRooms = new Room[counterFoundRooms];

        Room[] api1 = apis[0].findRooms(price, persons, city, hotel);
        Room[] api2 = apis[1].findRooms(price, persons, city, hotel);
        Room[] api3 = apis[3].findRooms(price, persons, city, hotel);

        int i = 0;
        for (Room r : api1) {
            foundRooms[i] = r;
            i++;
        }

        for (Room r : api2) {
            foundRooms[i] = r;
            i++;
        }

        for (Room r : api3) {
            foundRooms[i] = r;
            i++;
        }

        DAOimpl dao = new DAOimpl();
        for (Room r : foundRooms) {
            dao.save(r);
        }

        return foundRooms;

    }

    Room[] check(API api1, API api2) {
        Room[] roomsApi1 = api1.getAll();
        Room[] roomsApi2 = api2.getAll();

        // count same rooms
        int roomCounter = 0;
        for (Room r : roomsApi1) {
            if (api1.equals(roomsApi2)) roomCounter++;
        }

        // save same rooms
        Room[] sameRooms = new Room[roomCounter];

        for (int i = 0; i < roomCounter; i++) {
            if (api1.equals(roomsApi2)) {
                sameRooms[i] = roomsApi2[i];
            }
        }
        return sameRooms;
    }

}
