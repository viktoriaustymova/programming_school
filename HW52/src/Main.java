import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Создать класс "Dictionary" - таблица слов и их переводов.
        //
        //dictionary.put("Hello", "Привет");
        //dictionary.put("Bye", "Пока");
        //
        //dictionary.get("Hello"); // Привет
        //
        //Вложенный класс - DictionaryPair (содержит исходное слово и перевод)
        //Внутренний класс - Translator
        //
        //Класс содержит метод String[] translate(String[] words)
        //
        //dictionary.put("Hello", "Привет");
        //dictionary.put("Bye", "Пока");
        //
        //String[] words = {"Hello", "Bye", "Java"};
        //
        //translator.translate(words); // {"Привет", "Пока", "Java"}


        Dictionary dictionary = new Dictionary();
        dictionary.put("Hello","Привет");
        dictionary.put("Bye","Пока");
        dictionary.put("Java","Java");

        System.out.println(dictionary.get("Hello"));
        System.out.println(dictionary.get("Bye"));
        System.out.println(dictionary.get("Java"));

        String[] words = {"Hello", "Bye", "Java"};

        Dictionary.Translator translator = dictionary.new Translator();

        translator.translate(words);

        System.out.println(Arrays.toString(words));
        System.out.println(Arrays.toString(translator.translate(words)));

    }
}