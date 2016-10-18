package module7.homework.task12345.module5Refactored;


public class Main {

    public static void main(String[] args) {
        Controller controller = new Controller();

        controller.requestRooms(300, 2, "Paris", "GrandHotel");
        controller.requestRooms(200, 2, "Paris", "Radison");
        controller.requestRooms(280, 10, "London", "Test");

        controller.check(new BookingComAPI(), new GoogleAPI());
        controller.check(new BookingComAPI(), new TripAdvisorAPI());
        controller.check(new GoogleAPI(), new TripAdvisorAPI());
    }

}
