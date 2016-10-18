package module7.homework.task12345.module5Refactored;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Controller {

    private List<API> apis = new ArrayList<>();

    public Controller() {
        apis.add(new BookingComAPI());
        apis.add(new GoogleAPI());
        apis.add(new TripAdvisorAPI());
    }

    public List<Room> requestRooms(int price, int persons, String city, String hotel) {
        // found rooms across of all apis
        List<Room> foundRooms = new ArrayList<>();

        for (API api : apis) {
            foundRooms.addAll(api.findRooms(price, persons, city, hotel));
        }

        // save found rooms
        DAO dao = new DAOImpl();
        for (Room r : foundRooms) {
            dao.save(r);
        }
        return foundRooms;
    }


    public List<Room> check(API api1, API api2) {
        Collection<Room> roomsApi1 = api1.getAll();
        Collection<Room> roomsApi2 = api2.getAll();

        // save same rooms
        List<Room> sameRooms = new ArrayList<>();

        for (Room rApi1 : roomsApi1) {
            for (Room rApi2 : roomsApi2) {
                if (rApi2.equals(rApi1)) sameRooms.add(rApi2);
            }
        }

        for (Room r : sameRooms) {
            System.out.println("Result of check is: " + r);
        }
        return sameRooms;
    }
}
