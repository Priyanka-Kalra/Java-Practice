import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    
    public static void main(String[] args) {
        
        Map<String,Integer> students=new HashMap<String, Integer>();

        students.put("Harsh", 25);
        students.put("King", 30);
        students.put("Supreme", 32);
        students.put("Harsh", 10);

        System.out.println(students);
        System.out.println(students.keySet());
        for(String key: students.keySet())System.out.println(key+" : "+students.get(key));


    }
}
