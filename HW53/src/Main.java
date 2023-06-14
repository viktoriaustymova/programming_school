public class Main {
    //Задание 1
    //Дано натуральное число n. Выведите все числа от 1 до n.
    //Иными словами, функция принимает натуральное число и выводит числа от 1 до это числа.
    //Например, для параметра 6 -> выведет 1 2 3 4 5 6


    //Задание 2
    //Дано слово, состоящее только из строчных латинских букв.
    // Проверьте, является ли это слово палиндромом.
    // Выведите yes, если является и no - если не является.

    public static void main(String[] args) {
        recursivePrint(6);
        System.out.println("********************");
        recursivePrintReversed(6);

        System.out.println("*****Задание 2****");

        System.out.println(isPalindrom("lahal"));
        System.out.println(isPalindrom("hello"));


    }
    public static void recursivePrint(int number){
        if(number == 0){//базовый случай, начало
            System.out.println(0);
        } else {
            System.out.println(number);
            recursivePrint(number-1);//от числа до 0
        }
    }

    public static void recursivePrintReversed(int number){
        if (number == 1) {
            System.out.println(1);
        } else {
            recursivePrintReversed(number - 1);
            System.out.println(number);
        }
    }

    public static String isPalindrom(String word){
        if (word.length()<=1){
            return "Yes";
        } else {
            if(word.charAt(0) != word.charAt(word.length()-1)){
                return "No";
            }
            return isPalindrom(word.substring(1,word.length()-1));
        }
    }

}