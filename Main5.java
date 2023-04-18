import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.HashMap;
import java.util.HashSet;

public class Main5 {
    public static void main(String[] args) {
       
        Computer comp1 = new Computer(45000, true, "Window", "Silver");
        Computer comp2 = new Computer(60000, false, "Window", "Black");
        Computer comp3 = new Computer(100000, true, "macOS", "Silver");

        System.out.println(comp1);

        Set<Computer> set = new HashSet<>();
        set.add(comp1);
        set.add(comp2);
        set.add(comp3);

        System.out.println(set);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Print the price: ");
        int price = scanner.nextInt();
        System.out.println("Print the color: ");
        String color = scanner.toString();
        Map <Integer, String> map = new HashMap<>();
        map.get(price);
        map.get(color);
        

    }
    

}
