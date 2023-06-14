import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    /*1
    Создайте класс Student со следующими полями: String fName, String lName, int doneHomeWork, int missingLesson}.
     Реализуйте в нем интерфейс Comparable.
     Студенты должны быть сравниваемы по количеству пропущенных уроков.
     Создайте список студентов, отсортируйте этот список в порядке по возрастанию пропущенных студентом уроков.

        2 (дополнительно)
        Реализуйте программу, которая выводит на экран список студентов.
        Спрашивает у пользователя в каком порядке нужно отсортировать список.
        Выводит на экран список студентов в нужном порядке.

        Подсказка 1. Запрос «в каком порядке сортировать» можно организовать, например, следующим образом:
        “1-по имени и фамилии, 2- по количеству пропусков, 3 – по количеству выполненных работ. Выберите номер сортировки:

        Подсказка 2. Для каждого варианта необходимо создать свой компоратор.*/

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>(List.of(
                new Student("David","Muller",10,0),
                new Student("Maria","Weber",12,8),
                new Student("Alex","Richter",7,2)
        ));

        System.out.println("Список студентов до сортировки " + students);
        Collections.sort(students);
        System.out.println("Список студентов после сортировки " + students);



        Scanner scanner = new Scanner(System.in);
        System.out.println("Как Вы хотите отсортировать список?");
        System.out.println("1-по имени и фамилии, 2- по количеству пропусков, 3 – по количеству выполненных работ. " +
                "Выберите номер сортировки:");
        String answer = scanner.nextLine();
        switch (answer) {
            case "1" : students.sort(new ComparatorStudentsByfName());
                System.out.println("Список студентов после сортировки по имени: " + students);
                break;
            case "2" : students.sort(new ComparatorStudentsByDoneHomeWork());
                System.out.println("Список студентов после сортировки по количеству выполненных домашних заданий: "
                        + students);
                break;
            case "3" : students.sort(new ComparatorStudentsByMissingLesson());
                System.out.println("Список студентов после сортировки по количеству пропущенных уроков: "
                        + students);
        }











    }
}