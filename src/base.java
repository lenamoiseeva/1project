import java.util.Scanner;
/**@author Lena Moiseeva
 * @return  the sum of numbers*/
public class base {
    //just a simple calcularor
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double fn, sn, result;

        System.out.println("Enter the first number: ");
        fn = scanner.nextDouble();
        System.out.println("Enter the second number: ");
        sn = scanner.nextDouble();

        result = fn + sn;

        System.out.printf("Sum is: = %.4f", result);
    }
}
