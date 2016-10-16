package module8.homework;


import java.util.List;

public interface AbstractDAOTemp<T> {

    /**
     * Create universal interface AbstractDAO (T) with following methods
     *
     * List ---- out DB emulator
     *
     * T save(T)
     * void delete(T)
     * void deleteAll(List T)
     * void saveAll(List T)
     * List T getList()
     */

    <T> save(T);
    void delete(T);
    void deleteAll(List T);
    void saveAll(List T);
    List<T> getList();

}
