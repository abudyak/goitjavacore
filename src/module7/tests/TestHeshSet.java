package module7.tests;


import java.util.HashSet;
import java.util.Set;

public class TestHeshSet {

    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("aaa");
        set.add("ccc");
        set.add("bbb");
        set.add("aaa");
        set.remove("ccc");

        System.out.println(set.size());
    }
}
