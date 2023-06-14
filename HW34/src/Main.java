public class Main {
    public static void main(String[] args) {
        //Задание 1
        //Напишите метод indexOf, который возвращает индекс заданного символа в заданной строке.
        // Т.е. метод принимает строку и char и возвращает позиуию,
        // где этот символ первый раз встречается в строке.
        //Если в заданной строке нет заданного символа, то метод должен вернуть -1.
        //Примеры: indexOf("Java is the best", 'i') -> 5
        //indexOf("Java is the best", 'q') -> -1
        //indexOf("Java is the best", 'a') -> 1
        System.out.println(indexOf("Java is the best",'q'));
        System.out.println(indexOf("Java is the best",'a'));

    }
    public static int indexOf(String word,char a) {
        for (int i = 0;i<word.length();i++) {
            if (word.charAt(i)==a) {
                return i;
            }
        }
        return (-1);
    }


}