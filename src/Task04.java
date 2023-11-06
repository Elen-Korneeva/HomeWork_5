import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        System.out.println("Задание №4");
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите координату х: ");
        double x = sc.nextDouble();
        System.out.println("Введите координату у: ");
        double y = sc.nextDouble();
        if (x > 0 && y > 0) {
            System.out.println("Точка находится в 1 четверти");
        } else if (x < 0 && y > 0) {
            System.out.println("Точка находится во 2 четверти");
        } else if (x < 0 && y < 0) {
            System.out.println("Точка в 3 четверти");
        } else if (x > 0 && y < 0) {
            System.out.println("Точка в 4 четверти");
        }
        System.out.println();
    }
}
