import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        System.out.println("Задание № 11");
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите коэффицент а: ");
        double a = sc.nextDouble();
        System.out.println("Введите коэффицент b: ");
        double b = sc.nextDouble();
        System.out.println("Введите коэффицент c: ");
        double c = sc.nextDouble();

        double discr = b * b - 4 * a * c;
        if (discr > 0) {
            double x1 = (-b + Math.sqrt(discr)) / (2 * a);
            double x2 = (-b - Math.sqrt(discr)) / (2 * a);
            System.out.println("корни квадратного уравнения: x1 = " + x1 + " x2 = " + x2);
        } else if (discr == 0) {
            double x = -b/ (2 * a);
            System.out.println(" корень равен x = " + x);
        } else {
            System.out.println("квадратное уравнение не имеет действительных корней");
        }
    }
}

