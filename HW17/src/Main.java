public class Main {
    public static void main(String[] args) {
        //Задание 1
        //Создайте массив char со следующими элементами: 'j', 'l', 'k', 't', 'y', 'u'.
        // Выведите элементы в консоль в обратном порядке.
        // (Внимание! В обратном порядке - это от последнего элемента к первому )

        char[] letters =  {'j', 'l', 'k', 't', 'y', 'u'};
        for (int i= letters.length-1;i > 0;i--) {
            System.out.println(letters[i]);
        }
    }
}