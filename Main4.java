import java.util.Map;
import java.util.HashMap;

public class Main4 {
    public static void main(String[] args) {
        /*
        Реализуйте структуру телефонной книги с помощью HashMap, учитывая, 
        что 1 человек может иметь несколько телефонов.
        487 Иванов
        879 Петров
        256, 589 Смирнов
        */  

        Map<String, String> map = new HashMap<>();
            map.put("Иванов", "487");
            map.put("Петров", "879");
            map.put("Смирнов", "256, 589");
        System.out.println(map);
    
    }
    
}
