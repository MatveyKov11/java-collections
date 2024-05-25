import java.util.*;

public class MapTest {
    public static void main(String[] args) {
        HashMap<Long, String> m1 = new HashMap<>();
        m1.put(89217255054L, "Сидоров Агафон Никанорович");
        m1.put(89535720971L, "Петров Петр Петрович");
        m1.put(89113315675L, "Иванов Иван Иванович");
        for(Map.Entry<Long, String> val: m1.entrySet()){
            System.out.println(val);
        }
        System.out.println();
        TreeMap<Long, String> m2 = new TreeMap<>(m1);
        for(Map.Entry<Long, String> val: m2.entrySet()){
            System.out.println(val);
        }
        System.out.println();
        LinkedHashMap<Long, String> m3 = new LinkedHashMap<>();
        m3.put(89217255054L, "Сидоров Агафон Никанорович");
        m3.put(89535720971L, "Петров Петр Петрович");
        m3.put(89113315675L, "Иванов Иван Иванович");
        for(Map.Entry<Long, String> val: m3.entrySet()){
            System.out.println(val);
        }
        System.out.println();
        HashSet<Pair> m4 = new HashSet<>();
        m4.add(new Pair(89217255054L, "Сидоров Агафон Никанорович"));
        m4.add(new Pair(89535720971L, "Петров Петр Петрович"));
        m4.add(new Pair(89113315675L, "Иванов Иван Иванович"));
        for(Map.Entry<Long, String> val: m2.entrySet()){
            System.out.println(val);
        }
    }
}
