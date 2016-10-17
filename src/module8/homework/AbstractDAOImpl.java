package module8.homework;

import java.util.ArrayList;
import java.util.List;


public class AbstractDAOImpl<T extends User> implements AbstractDAO<T> {

    private List<T> list = new ArrayList<>();

    @Override
    public T save(T t) {
        list.add(t);
        return t;
    }

    @Override
    public void delete(T t) {
        list.remove(t);
    }

    @Override
    public void deleteAll(List<T> t) {
        list.removeAll(t);
    }

    @Override
    public void saveAll(List<T> t) {
        list.addAll(t)
    }

    @Override
    public List<T> getList() {
        return list;
    }

    @Override
    public void deleteById(long id) {
        list.remove(get(id));
    }

    @Override
    public T get(long id) {
        for (T t : list) {
            if (t.getId() == id) return t;
        }
        return null;
    }
}
