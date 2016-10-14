package module7.tests;


import java.util.HashSet;
import java.util.Set;

public class TestHashSet {

    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        set.add("test");
        set.add("test1");
        set.add("test");
        System.out.println(set.size());
    }


}
