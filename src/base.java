import java.util.Scanner;
/**
 * @author Lena Moiseeva
 * 1 - calcularor
 * 2 - search for the longest word in the array
 */
public class base {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select action: 1 - Calculator , 2 - Search for the longest word in the array");
        int choice1 = scanner.nextInt();
        if (choice1 == 1) {
            double fn, sn, result;
            System.out.println("Enter the first number: ");
            fn = scanner.nextDouble();
            System.out.println("Enter the second number: ");
            sn = scanner.nextDouble();
            System.out.println("Select one of options: 1 - Addition(+), 2 - Subtraction(-), 3 - Multiplication(*), 4 - Division(/)");
            int choice2 = scanner.nextInt();
            switch (choice2) {
                case 1: {
                    result = fn * sn;
                    System.out.printf("Result = %.4f", result);
                    break;
                }
                case 2: {
                    result = fn / sn;
                    System.out.printf("Result = %.4f", result);
                    break;
                }
                case 3: {
                    result = fn + sn;
                    System.out.printf("Result = %.4f", result);
                    break;
                }
                case 4: {
                    result = fn - sn;
                    System.out.printf("Result = %.4f", result);
                    break;
                }
                default:
                    System.out.println("Invalid value");
            }
        }
        else if (choice1 == 2) {
            Scanner scanner1 = new Scanner(System.in);
            System.out.println("Enter the dimension of the array:");
            int a = scanner1.nextInt();
            String b[] = new String[a];

            for (int i = 0; i < b.length; i++) {
                System.out.println("Enter the word №" + i);
                String c = scanner.next();
                b[i] = c;
            }
            String Word = b[0];
            int max = Word.length();
            for (int i = 0; i < b.length; i++) {
                if (max < b[i].length()) {
                    Word = b[i];
                }
            }
            System.out.println("The longest word is " + Word);
        }
    }
}
