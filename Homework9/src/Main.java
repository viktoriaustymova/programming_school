import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Задание 1
        //Утро субботы, вчера у нас был корпоратив. На завтрак нужно приготовить бутерброд.
        //Пусть программа спрашивает, что вы хотите положить для каждого из 4 ингредиентов?
        //"Что вы положите вниз?"
        //"Что дальше?" и т.д.
        //Из ингредиентов у нас есть:
        //хлеб - bread,
        //помидор- tomato,
        //ветчина - hum.
        //сыр - cheese
        //Если вниз бутерброда положили что-нибудь кроме хлеба - программа выведет в консоль одну фразу:
        // "Какой необычный бутерброд". Если ветчина будет сверху сыра - программа выведет:
        // "Идеальный бутерброд", в противном случае: "Вкусный бутерброд".

        Scanner scanner = new Scanner(System.in);
        System.out.println("We have four ingredients for our sandwich: bread, tomato, hum and cheese. " +
                "What are you going to put down?");
        String bread = "bread";
        String tomato = "tomato";
        String hum = "hum";
        String cheese = "cheese";
        String firstIngredient = scanner.next();
        System.out.println("What is the next?");
        String secondIngredient = scanner.next();
        System.out.println("What is the next?");
        String thirdIngredient = scanner.next();
        System.out.println("What is the next?");
        String fourthIngredient = scanner.next();
        boolean breadIsNotFirst = !bread.equalsIgnoreCase(firstIngredient);
        boolean numberOfHum = (hum.equalsIgnoreCase(thirdIngredient) || (hum.equalsIgnoreCase(fourthIngredient)));
        boolean numberOfCheese = (cheese.equalsIgnoreCase(secondIngredient) ||
                (cheese.equalsIgnoreCase(thirdIngredient)));
        boolean humAfterCheese = numberOfHum && numberOfCheese;

        if (breadIsNotFirst) {
            System.out.println("What an unusual sandwich!");
        } else if (humAfterCheese) {
            System.out.println("Perfect sandwich");
        } else {
            System.out.println("Tasty sandwich");
        }

    }
}
