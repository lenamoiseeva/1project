import java.util.Scanner;
/**@author Lena Moiseeva
*/
public class base {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double fn, sn, result;
        //Вводим первое число
        System.out.println("Enter the first number: ");
        fn = scanner.nextDouble();
        //Вводим второе число
        System.out.println("Enter the second number: ");
        sn = scanner.nextDouble();
        
        result = fn + sn;
        //Выводим сумму чисел с округлением
        System.out.printf("Sum is: = %.4f", result);
    }
}
