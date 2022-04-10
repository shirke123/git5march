package collectionFramewok;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {

        Map<Integer,String> map=new HashMap<>();
        map.put(1,"ABC");
        map.put(2,"PQR");
        map.put(3,"XYZ");

        map.forEach((K,v)->{
            System.out.println(K+""+v);
        });
       System.out.println(map);
    }

}
