package module8.tests;


import java.util.HashMap;
import java.util.Map;

public class TestQuestions123 {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("key", "value");
        map.put("key", "value");
        String res1 = map.get("key");
        System.out.println("res1 = " + res1);

//        Map map2 = new HashMap<>();
//        map2.put("key", "value");
//        String res2 = map2.get("key");
//        System.out.println("res = " + res2);

        Map<String, String> map3 = new HashMap<>();
        map3.put("key", "value");
        map3.put("key", "value");
        map3.put("key1", "value");
        System.out.println(map3.keySet().size());



    }


}
