import java.util.ArrayList;
import java.util.Random;

public class Main2 {
    public static void main(String[] args) {
        /*
         * Пусть дан произвольный список целых чисел, удалить из него четные числа/
         */
        List<Integer> arr = new ArrayList<>();
        createArray();
        sortArray(arr);
    }

    static void createArray() {

        Random rnd = new Random();
        for (int i = 0; i < 10; i++) {
            arr.add(rnd.nextInt(10));
        }
    }

    static void sortArray(int arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0)
                arr.add(arr[i]);
        }
    }
}
