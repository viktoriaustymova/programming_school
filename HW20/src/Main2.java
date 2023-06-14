public class Main2 {
    /*
    Задание 2 *
    Создайте метод, который принимает массив слов,
    и заменяет самое длинное слово на "***".
    Например,для массива {"apple", "orange", "grape"}
    вызов метода изменит массив на {"apple", "***", "grape"}.
    Данный метод должен менять исходный массив.

    !!!В решении получилось заменить все самые длинные слова
     */
    public static void main(String[] args) {
        String [] fruits = new String []{"apple", "orange","grape"};
        replaceTheLongestWord(fruits);
        printArray(fruits);

    }
    public static void replaceTheLongestWord(String [] array) {
        int maxLength = array[0].length();
        int maxIndex = 0;
        for (int i=1; i< array.length;i++) {
            if (array[i].length()>maxLength) {
                maxLength = array[i].length();
                maxIndex =i;
            }
            if(array[i].length()==maxLength) {
                array[i] = "***";
            }
        }

    }
    public static void printArray(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

}
