
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // FirstTask ();
        SecondTask();
    }
    // Вычислить n-ое треугольного число (сумма чисел от 1 до n)
    public static void FirstTask (){
            System.out.println("Write the number: ");
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            int m = 1;
            int count = 0;
            if( n != 1){
                while(n != m){
                count += m;
                m = m + 1;
                }
            System.out.println(count + m);
            }
    }
    // Вычислить n! (произведение чисел от 1 до n)
    public static void SecondTask(){
        System.out.println("Write the number: ");
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            int m = 1;
            int k = 1;
            int g = 2;
            
            if(n != 1){
                while(n > k){
                    m = m * g;
                    k += 1;
                    g += 1;
                }
            System.out.println(m);
            }
    }

}