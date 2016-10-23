package module7.homework.task12345.task5;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MeasureUtil<T> {

    public long addTimeExecution(long nElements, String listType, T t) {
        if (listType.equals("arrayList")) {
            long start = System.currentTimeMillis();
            List<T> list = new ArrayList<>();
            for (int i = 0; i < nElements; i++) {
                list.add(t);
            }
            long finish = System.currentTimeMillis();
            return finish - start;
        }
        if (listType.equals("linkedList")) {
            long start = System.currentTimeMillis();
            List<T> list = new LinkedList<>();
            for (int i = 0; i < nElements; i++) {
                list.add(t);
            }
            long finish = System.currentTimeMillis();
            return finish - start;
        }
        return 1;
    }

//    public long setTimeExecution(List<T> list, String listType, T t) {
//        if (listType.equals("arrayList")) {
//            long start = System.currentTimeMillis();
//
//            for (T item : list) {
//      //          item.set();
//            }
//            long finish = System.currentTimeMillis();
//            return finish - start;
//        }
//        if (listType.equals("linkedList")) {
//            long start = System.currentTimeMillis();
//            //List<T> list = new LinkedList<>();
//            for (int i = 0; i < nElements; i++) {
//                list.set(i, t);
//            }
//            long finish = System.currentTimeMillis();
//            return finish - start;
//        }
//        return 1;
//    }
}
