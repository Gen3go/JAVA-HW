
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // FirstTask ();
        // SecondTask();
        // ThirdTask();
        FourthTask();
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
    // Вывести все простые числа от 1 до 1000
    // (числа, которые делятся только на 1 и на себя без остатка)
    public static void ThirdTask(){

        int n = 1;
        while(n < 1000){
            if(n % n == 0);
            System.out.println(n);
            n += 1;
        }
    }
    // Реализовать простой калькулятор (введите первое число,
    // введите второе число, введите требуемую операцию, ответ)
    public static void FourthTask(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int n = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int m = scanner.nextInt();
        System.out.println("Which operation do you want to do: ");
        char k = scanner.next().charAt(0);
        if (k == '+'){
            System.out.println(m+n);
            }
        if (k == '-'){
            System.out.println(m-n);
        }
        if (k == '*'){
            System.out.println(m*n);
        }
        if (k == '/'){
            System.out.println(m/n);
        }
        }
        
    }
