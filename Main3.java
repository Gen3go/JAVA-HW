import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        /* 
        Пусть дан LinkedList с несколькими элементами. 
        Реализуйте метод, который вернёет «перевёрнутый» список.
        */
        LinkedList<Integer> list = new LinkedList<>();
        // Scanner scanner = new Scanner(System.in);
        // int dataFromTheUser = scanner.nextInt();
        list.add(1);
        list.add(2);
        list.add(3);
        
        // reverse(list);
        // enqueu(list,dataFromTheUser);
        // dequeue(list);
        first(list);


        }
        static void reverse(LinkedList<Integer> list) {
            LinkedList<Integer> list2 = new LinkedList<>();

            for (int i = list.size()-1; i >= 0; i--) {
                list2.add(list.get(i));
            }
            System.out.println(list2);
        }
        static void enqueu(LinkedList<Integer> list, int dataFromTheUser){
            //помещает элемент в конец очереди
            list.addLast(dataFromTheUser);
            System.out.println(list);
        }
        static void dequeue(LinkedList<Integer> list){
            //возвращает первый элемент из очереди и удаляет его
            list.removeFirst();
            System.out.println(list);
        }
        static void first(LinkedList<Integer> list){
        //возвращает первый элемент из очереди, не удаляя.
        System.out.println(list.getFirst());
        }
    }
