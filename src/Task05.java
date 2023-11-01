import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        System.out.println("Задание №5");
        String[] nazv = {"Крыса", "Бык", "Тигр", "Кролик", "Дракон", "Змея",
                "Лошадь", "Коза", "Обезьяна", "Петух", "Собака", "Свинья"};
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число, месяц и год (например: 05 12 1974)");
        int d = sc.nextInt();
        int m = sc.nextInt();
        int god = sc.nextInt();
        String zodiacGod = nazv[(god - 4) % 12];

        String zodiacSing = "";
        switch (m) {
            case 1:
                if (d < 20) {
                    zodiacSing = "Козерог";
                } else {
                    zodiacSing = "Водолей";
                }
                break;
            case 2:
                if (d < 19) {
                    zodiacSing = "Водолей";
                } else {
                    zodiacSing = "Рыбы";
                }
                break;
            case 3:
                if (d < 21) {
                    zodiacSing = "Рыбы";
                } else {
                    zodiacSing = "Овен";
                }
                break;
            case 4:
                if (d < 20) {
                    zodiacSing = "Овен";
                } else {
                    zodiacSing = "Телец";
                }
                break;
            case 5:
                if (d < 21) {
                    zodiacSing = "Телец";
                } else {
                    zodiacSing = "Близнецы";
                }
                break;
            case 6:
                if (d < 22) {
                    zodiacSing = "Близнецы";
                } else {
                    zodiacSing = "Рак";
                }
                break;
            case 7:
                if (d < 23) {
                    zodiacSing = "Рак";
                } else {
                    zodiacSing = "Лев";
                }
                break;
            case 8:
                if (d < 23) {
                    zodiacSing = "Лев";
                } else {
                    zodiacSing = "Дева";
                }
                break;
            case 9:
                if (d < 23) {
                    zodiacSing = "Дева";
                } else {
                    zodiacSing = "Весы";
                }
                break;
            case 10:
                if (d < 23) {
                    zodiacSing = "Весы";
                } else {
                    zodiacSing = "Скорпион";
                }
                break;
            case 11:
                if (d < 23) {
                    zodiacSing = "Скорпион";
                } else {
                    zodiacSing = "Стрелец";
                }
                break;
            case 12:
                if (d < 22) {
                    zodiacSing = "Стрелец";
                } else {
                    zodiacSing = "Козерог";
                }
                break;
        }
        System.out.println("Знак: " + zodiacSing);
        System.out.println("Год: " + zodiacGod);
    }
}
