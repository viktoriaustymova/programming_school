public class Main2 {
    public static void main(String[] args) {
        //Реализовать свой метод substring().
        // Т.е в метод приходит строка и два целых числа index1 и index2.
        // Метод возвращает подстроку, начиная с символа в позиции
        // index1 до символа в позиции index2.
        // Причем символ в позиции index1 включаем в результат а символ в позиции index2 не включаем.
        // Если даны "ошибочные параметры", например index2<=index1
        // или один из индексов не попадает в строку, метод должен возвращать пустую строку
        System.out.println(substring("Java is the best", 0, 6));
        System.out.println(substring("Java is the best", 1, 4));
        System.out.println(substring("Java is the best", 1, 1));
    }
    public static String substring(String word,int index1,int index2) {
        if (index2 <= index1 || index2 > word.length()) {
            return "empty";
        }
        if (index1 < 0 || index1 > word.length()-1){
            return "empty";
        }
        String result ="";
        for (int i =index1;i<index2;i++) {
            char a = word.charAt(i);
            result +=a;
        }
    return result;
    }
}
