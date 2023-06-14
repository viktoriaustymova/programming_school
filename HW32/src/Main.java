import java.io.*;

/*
Задание 1
        Создайте новый проект(File -> New -> Project)
        Назовите его TelephoneBook
        Внутри проекта создайте папку res
        Выведите сообщение для пользователя: "Желаете добавить контакт?"
        Далее c помощью BufferedReader получите от пользователя имя и номер телефона
        Выведите сообщение для пользователя: "Введите имя"
        Выведите сообщение для пользователя: "Введите номер"
        И запишите их в файл contacts.txt в папке res c помощью BufferedWriter
        * дополнительно сделайте вариант с циклом while или do-while,
        который бы спрашивал у пользователя контакты, пока пользователь не скажет нет.
*/

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter
                (new FileWriter("./res/contacts.txt",true));
        String answer = "да";
        while (answer.equalsIgnoreCase("да")) {
            System.out.println("Желаете добавить контакт?");
            answer = reader.readLine();
            if (answer.equalsIgnoreCase("да")){
                System.out.println("Введите имя");
                String name = reader.readLine();
                writer.write("Имя: " + name);
                writer.newLine();
                System.out.println("Введите номер");
                String number = reader.readLine();
                writer.write("Номер телефона: " + number);
                writer.newLine();
            }
        }
        reader.close();
        writer.close();

    }
}