package module5.homework.task1234567;


public class DAOimpl implements DAO {

    @Override
    public Room save(Room room) {
        System.out.println(room.toString() + " saved");
        return room;
    }

    @Override
    public boolean delete(Room room) {
        System.out.println(room.toString() + " deleted");
        return true;
    }

    @Override
    public Room update(Room room) {
        System.out.println(room.toString() + " deleted");
        return room;
    }

    @Override
    public Room findById(long id) {
        Room room = new Room(id, 0, 0, null , null, null);

        System.out.println(room.toString() + " room with id: " + id + " is found");
        return room;
    }
}
