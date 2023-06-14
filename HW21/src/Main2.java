public class Main2 {
    /*
    Задание 2 *
    Дано два массива, массив с именами студентов String[] students второй массив int[] skipLessons,
    в котором указано сколько занятий пропустил соответствующий студент.
    Т.е. если в первом массиве students[2]="jack", то skipLessons[2] содержжит количество прогуленных Джжеком занятий.
    Вам нужно реализовать:
    метод, который печатает всех студентов, у кого прогулов больше чем заданное число N
    метод, который создаст новый массив со строками вида:
    "Jack прогулял 5 занятий" для всех студентов, которые прогулмвали
    "Nick не прогуливал" для всех, кто не прогуливал
     */
    public static void main(String[] args) {
        String[] students = new String []{"Nick","Ann", "Jack", "John"};
        int[] skipLessons = new int[]{0,5,7,10};
        int number = 3;
        System.out.print("Студенты, который прогуляли больше чем " + number + " занятий: ");
        studentsWhoHaveMoreSkips(students,skipLessons,number);
        printArray(studentsWhoHaveSkips(students,skipLessons));



    }
    public static void studentsWhoHaveMoreSkips(String[] array,int[]array1, int number) {
        String result = "";
        for (int i = 0; i< array1.length; i++) {
            if (array1[i]>number) {
                result += array[i] + " ";
            }
        }
        System.out.println(result);
    }

    public static String [] studentsWhoHaveSkips(String[] array,int[]array1) {
        String[] array2 = new String[array.length];
        for (int i = 0; i< array1.length; i++) {
            if (array1[i]>0) {
                array2[i]= array[i] + " " + "прогулял" + " " + array1[i] +  " " + "занятий";
            }
            else {
                array2[i]= array[i] + " не прогуливал";
            }
        }
        return array2;
    }

    public static void printArray(String[] array){
        for (int i = 0; i< array.length; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
}
