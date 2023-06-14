public class Main {
    /*  Задание 1
    Создайте метод, который принимает массив String[] arr и слово String word;
    Метод должен возвращать true - если слово есть в массиве, false - если его нету.
    Метод не должен менять исходный массив.
    Примеры:
    для параметров {"apple", "orange"}, "orange" --> true;
    для параметров {"apple", "orange"}, "banana" --> false;

     */
    public static void main(String[] args) {
        String [] array = new String []{"apple", "orange"};
        System.out.println(returnTrueOrFalse(array,"apple"));
        System.out.println(returnTrueOrFalse(array,"banana"));
    }

    public static boolean returnTrueOrFalse(String[] array,String word)  {
        for (int i =0;i< array.length;i++ ) {
            if (word.equalsIgnoreCase(array[i])) {
                return true;
            }
        }
        return false;
    }
}