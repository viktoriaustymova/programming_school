public class Main {
    //Задание 2 *
    //Cоздайте функциональный интерфейс - который принимает строку и число и возвращает строку.
    //Cоздайте метод repeat, который принимает строку,
    // число и лямбду(ее тип - это интерфейс, который вы создали) и возвращает новую строку.
    //Вызовите метод, передав в него лямбду,
    // такую что возвращается строка повторенная указанное количество раз.
    public static void main(String[] args) {
        System.out.println(repeat((str,n) -> str,"hello ",3));


        Repeatable repeat3times = ((str,n) -> str.repeat(3));
        String str2 = repeat2("cat ",3,repeat3times);
        System.out.println(str2);

        Repeatable repeatNTimes = (str, num) -> {
            return str.repeat(num);
        };
        String str3 = repeat2("cat ", 10, repeatNTimes);
        System.out.println(str3);

        // лябмда которая 3 раза повторяет слово и добавляет слово перец
        String str4 =
                repeat2("cat", 10, (str, num) -> str + str + str + "paper");
        String str5 =
                repeat2("cat", 10, (str, num) -> "any word");
        System.out.println(str4);
        System.out.println(str5);
    }

    public static String repeat(Repeatable repeatable,String str,int n){
        String result = "";
        for(int i =0; i< n; i++){
            result+=str;
        }
        return result;
    }

    public static String repeat2(String str, int n, Repeatable repeatable){
        return repeatable.getStr(str,n);
        }
    }

