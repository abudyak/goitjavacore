package module5.homework.task1234567;


import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Controller controller = new Controller();

        System.out.println("Request 1");
        System.out.println(Arrays.toString(controller.requestRooms(300, 2, "Paris", "GrandHotel")));
        System.out.println("Request 2");
        System.out.println(Arrays.toString(controller.requestRooms(200, 2, "Paris", "Radison")));
        System.out.println("Request 3");
        System.out.println(Arrays.toString(controller.requestRooms(280, 10, "London", "Test")));

        System.out.println("Check 1");
        System.out.println(Arrays.toString(controller.check(new BookingComAPI(), new GoogleAPI())));
        System.out.println("Check 2");
        System.out.println(Arrays.toString(controller.check(new BookingComAPI(), new TripAdvisorAPI())));
        System.out.println("Check 3");
        System.out.println(Arrays.toString(controller.check(new GoogleAPI(), new TripAdvisorAPI())));

    }

}
