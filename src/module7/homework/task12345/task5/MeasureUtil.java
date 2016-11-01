package module7.homework.task12345.task5;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MeasureUtil<T> {

    public List<T> generateList(long nElements, String listType, T filler) {
        if (listType.equals("arrayList")) {
            List<T> list = new ArrayList<>();
            for (int i = 0; i < nElements; i++) {
                list.add(filler);
            }
            return list;
        } else if (listType.equals("linkedList")) {
            List<T> list = new LinkedList<>();
            for (int i = 0; i < nElements; i++) {
                list.add(filler);
            }
            return list;
        } else {
            return new ArrayList<>(0);
        }
    }

    public long addTimeExecution(long nElements, String listType, T filler) {
        if (listType.equals("arrayList")) {
            long start = System.currentTimeMillis();
            List<T> list = new ArrayList<>();
            for (int i = 0; i < nElements; i++) {
                list.add(filler);
            }
            long finish = System.currentTimeMillis();
            return finish - start;
        }
        if (listType.equals("linkedList")) {
            long start = System.currentTimeMillis();
            List<T> list = new LinkedList<>();
            for (int i = 0; i < nElements; i++) {
                list.add(filler);
            }
            long finish = System.currentTimeMillis();
            return finish - start;
        }
        return 1;
    }

    public long setTimeExecution(List<T> list, T filler) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < list.size(); i++) {
            list.set(i, filler);
        }
        long finish = System.currentTimeMillis();
        return finish - start;
    }

    public long getTimeExecution(List<T> list) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < list.size(); i++) {
            list.get(i);
        }
        long finish = System.currentTimeMillis();
        return finish - start;
    }

    public long removeTimeExecution(List<T> list) {
            long start = System.currentTimeMillis();
            for (int i = 0; i < list.size(); i++) {
                list.remove(i);
            }
            long finish = System.currentTimeMillis();
            return finish - start;
    }
}
