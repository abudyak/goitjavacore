package module5.homework.task1234567;


import java.util.Date;


public class TripAdvisorAPI implements API {

    private Room[] rooms = new Room[5];

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

        Room room1 = new Room(1, 400, 2, date1, "GrandHotel", "New York");
        Room room2 = new Room(2, 200, 2, date2, "Opera Hotel", "Kiev");
        Room room3 = new Room(3, 300, 2, date3, "GrandHotel", "Paris");
        Room room4 = new Room(4, 500, 2, date4, "GrandHotel", "Las Vegas");
        Room room5 = new Room(5, 200, 2, date5, "GrandHotel", "Tokyo");
    }

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        return new Room[0];
    }

}
