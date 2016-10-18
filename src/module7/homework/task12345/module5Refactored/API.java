package module7.homework.task12345.module5Refactored;


import java.util.Collection;

public interface API {

    Collection<Room> findRooms(int price, int persons, String city, String hotel);
    Collection<Room> getAll();

}
