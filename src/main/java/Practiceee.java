import java.util.*;

public class Practiceee {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        String data = "hii";
        map.put("hello", data);
        map.put("hi",null);
        map.put("ddd","ddddd");


        System.out.println(map);
        Set<Integer> set=new TreeSet<>();
        set.add(111);
        set.add(44);
        set.add(333);
        set.add(2222);

        System.out.println(set);
        for(Map.Entry<String,String> entry:map.entrySet()){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
        String hiValue=map.get("hi");
        System.out.println("value of hi: "+hiValue);
    }
}
