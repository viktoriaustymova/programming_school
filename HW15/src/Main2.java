public class Main2 {
    public static void main(String[] args) {
        //Задание 2
        //Создайте метод multiplyString, который принимает:
        //String word - слово;
        //int n - количество повторений.
        //Метод возвращает тип String, слово повторенное n раз.
        //Пример вызова метода:
        System.out.println(multiplyString("apple_",5));
    }
    public static String multiplyString(String word,int number) {
         String accumulator = "";
         for (int i =0; i<number; i++) {
             accumulator += word;
         }
         return accumulator;
    }
}
