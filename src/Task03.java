import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        System.out.println("Задание №3");
        Scanner sc = new Scanner(System.in);
        System.out.println("Выберите животное:");
        System.out.println("1.Кошка");
        System.out.println("2.Собака");
        System.out.println("3.Мышь");
        System.out.println("4.Тигр");
        System.out.println("5.Утка");
        System.out.println("6.Гусь");
        System.out.println("7.Баран");
        System.out.println("8.Корова");
        System.out.println("9.Свинья");
        System.out.println("10.Ворона");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Мяу-Мяу");
                break;
            case 2:
                System.out.println("Гав-Гав");
                break;
            case 3:
                System.out.println("Пи-Пи");
                break;
            case 4:
                System.out.println("Рыыыы");
                break;
            case 5:
                System.out.println("Кря-Кря");
                break;
            case 6:
                System.out.println("Га-га");
                break;
            case 7:
                System.out.println("Бе-Бе");
                break;
            case 8:
                System.out.println("Му-Му");
                break;
            case 9:
                System.out.println("Хрю-Хрю");
                break;
            case 10:
                System.out.println("Кар-Кар");
                break;
            default:
                System.out.println("Нет такого варианта");
        }
        System.out.println();
    }
}
