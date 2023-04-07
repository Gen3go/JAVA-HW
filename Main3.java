import java.util.LinkedList;

public class Main3 {
    public static void main(String[] args) {
        /* 
        Пусть дан LinkedList с несколькими элементами. 
        Реализуйте метод, который вернёет «перевёрнутый» список.
        */
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        reverse(list);
        }
        static void reverse(LinkedList<Integer> list) {
            LinkedList<Integer> list2 = new LinkedList<>();

            for (int i = list.size()-1; i >= 0; i--) {
                list2.add(list.get(i));
            }
            System.out.println(list2);
        }
    
}
