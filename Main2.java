import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main2 {
    public static void main(String[] args) {
        /*
         * Пусть дан произвольный список целых чисел, удалить из него четные числа/
         */
        List<Integer> arr = new ArrayList<>();
        List<Integer> arr2 = new ArrayList<>();
        createArray(arr);
        System.out.println(arr);
        // sortArray(arr);
        // System.out.println(createArray());
    }

    static int createArray(List<Integer> arr) {
        Random rnd = new Random();
        for (int i = 0; i < 10; i++) {
            arr.add(rnd.nextInt(2, 10));
        }
        System.out.println(arr);

        return arr;
    }

    static void sortArray(List<Integer> arr, List<Integer> arr2) {
        for (int i = 0; i < arr.size(); i++) {
            if (arr[i] % 2 == 0) {
                arr2.add(arr[i]);
            }
            System.out.println(arr2);
        }

    }

}
