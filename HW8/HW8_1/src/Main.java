import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Задание 2

a) Пользователь вводит с клавиатуры IBAN в две строки (Например так: DE2334923291).
Программа проверяет, что счет корректный, т.е.
длина составляет 12 символов, начинается на "DE".

b) Если после DE следует "2334"
(это значение должно быть заданно в программе как переменная) программа должна выдать сообщение:
"счет клиента №923291 в нашем банке" (№923291 - оставшиеся цифры счета).
Если после DE следует что-то другое, то программа должна выдать сообщение "введенный счет из другого филиала"
Например:
DE2334923291 -> счет клиента №923291 в нашем банке
G2334923291 -> некорректный номер счета
DE23349232916843 -> некорректный номер счета
DE5554923291 -> введенный счет из другого филиала
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите Ваш IBAN: ");
        String iban = scanner.nextLine();
        int lengthOfIban = iban.length();
        boolean length = lengthOfIban ==12;
        char first = iban.charAt(0);
        char second = iban.charAt(1);
        boolean firstLetter  = first == 'D';
        boolean secondLetter = second == 'E';
        String third = iban.substring(2,6);
        String numbers = "2334";
        boolean equals = third.equals(numbers);
        boolean isIbanCorrect = length & firstLetter & secondLetter & equals;
        String restOfNumbers = iban.substring(6);
        String space = " ";
        boolean anotherBank = length & firstLetter & secondLetter;


        if (isIbanCorrect ) {
            System.out.println("Счет клиента №" + restOfNumbers + space + "в нашем банке");

        } else if (anotherBank) {
            System.out.println("Введенный счет из другого филиала");

        } else {
            System.out.println("Некорректный номер счета");
        }

    }
}