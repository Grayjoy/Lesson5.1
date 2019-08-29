import java.util.Scanner;

public class Guess {

    Scanner scanner = new Scanner(System.in);

    int count;
    int random = (int) (Math.random() * (10 - 1 + 1) + 1);
    int scr;


    public void game() {
        System.out.println(random);
        while (scr != random) {
            System.out.println("Введите число от 1 до 10");
            scr = scanner.nextInt();
            count++;
            if (scr > random) {
                System.out.println("Ваше число больше");
            } else if (scr < random) {
                System.out.println("Ваше число меньше");
            } else {
                break;
            }
        }
        System.out.println("Угадал,количество попыток: " + count);
    }

}
