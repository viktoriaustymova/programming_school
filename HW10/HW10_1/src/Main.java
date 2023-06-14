import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Написать программу, которая спрашивает у пользователя его настроение, дальше два варианта:
        //
        //если ответ был "хорошо": выводит в консоль "Рад за тебя".
        //если ответ был любой другой: спрашивает: "Но ты же оптимистично настроен?"
        //если ответ на второй вопрос: да - выводит "Так держать"
        //если ответ на второй вопрос любой другой - выводит "Не кисни!"

        Scanner scanner = new Scanner(System.in);
        System.out.println("Как твое настроение?");
        String mood = scanner.next();
        String good = "хорошо";
        if (mood.equalsIgnoreCase(good)) {
            System.out.println("Рад за тебя");
        } else {
            System.out.println("Но ты же оптимистично настроен?");
            String mood2 = scanner.next();
            String yes = "да";
            if (mood2.equalsIgnoreCase(yes)) {
                System.out.println("Так держать");
            } else {
                System.out.println("Не кисни!");
            }
        }

    }
}