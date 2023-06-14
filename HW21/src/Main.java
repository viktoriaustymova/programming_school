public class Main {
    /*
    Задание 1
    Создайте метод, который принимает массив слов, и заменяет все самые длинные слова на "***".
    Например,для массива {"John","Ann", "Jack", "Ray"} вызов метода изменит
    массив на {"***","Ann", "***", "Ray"}.
    Данный метод должен менять исходный массив.
     */
    public static void main(String[] args) {
        String [] names = new String []{"John","Ann", "Jack", "Ray"};
        replaceTheLongestWords(names);
        printStringArray(names);

    }

    public static void replaceTheLongestWords(String[] array) {
        int maxLength = array[0].length();
        for (int i = 0;i< array.length;i++) {
            if (array[i].length()>maxLength) {
                maxLength = array[i].length();
            }
            if (array[i].length()==maxLength) {
                array[i]="***";
            }
        }
    }

    public static void printStringArray(String[] array) {
        for (int i = 0;i< array.length;i++) {
            System.out.print(array[i] + " ");
        }
    }
}