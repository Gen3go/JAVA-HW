import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main2 {
    public static void main(String[] args) {
        /*
         * Пусть дан произвольный список целых чисел, удалить из него четные числа/
         */
        
       
        System.out.println(createArray());
        sortArray(arr);

    }

    static List<Integer> createArray() {
        List<Integer> arr = new ArrayList<>();
        Random rnd = new Random();
        for (int i = 0; i < 10; i++) {
            arr.add(rnd.nextInt(2, 10));
        }

        return arr;
    }

    static List<Integer> sortArray(List<Integer> arr) {
        List<Integer> arr2 = new ArrayList<>();
        for (int i = 0; i < arr.size(); i++) {
            if (arr[i] % 2 == 0) {
                arr2.add(arr[i]);
            }
            System.out.println(arr2);
        }

    }

}
