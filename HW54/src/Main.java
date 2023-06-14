
public class Main {
    //Задание 1а
    //Создайте функциональный интерфейс,
    // с методом, который принимает два параметра - два слова String, тип возвращаемого значения - String;
    //Сделайте реализацию этого интерфейса - через анонимный класс.
    // Требуется чтобы метод в этой реализации возвращал самое короткое из этих двух слов.
    //Вызовите этот метод в main.
    //
    //Создайте лямбду на основе этого интерфейса.
    // Пусть в этой реализации метод возвращает самое длинное слово из двух. Вызовите метод.
    //

    public static void main(String[] args) {
        Words words = new Words() {
            @Override
            public String getWord(String word1, String word2) {
                if (word1.length()>word2.length()){
                    return "Самое короткое слово " + word2 ;
                } else if ((word1.length()<word2.length())){
                    return  "Самое короткое слово " + word1;
                } return "Слова равны";

                }
        };
        System.out.println(words.getWord("hello","bye"));

        Words words2 = (word1, word2) -> {
            if (word1.length()>word2.length()){
                return "Самое длинное слово " + word1 ;
            } else if ((word1.length()<word2.length())){
                return  "Самое длинное слово " + word2;
            } return "Слова равны";
        };
        System.out.println(words2.getWord("hello","bye"));

        Words getLongestFunctionVer2 =
                ((str1, str2) -> str1.length() > str2.length() ? str1 : str2);
        String longest2 = getLongestFunctionVer2.getWord("Tab", "Pages");
        System.out.println(longest2);
    }
}