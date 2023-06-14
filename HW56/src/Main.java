public class Main {
    //Создайте обобщенный класс рюкзак Backpack с полями String brand,
    //        и параметризированным полем content.
    //        сontent должен быть ограничен классом Book;
    //        Создайте рюкзак книг с книгой внутри.
    public static void main(String[] args) {
        Backpack<Book> backpack = new Backpack<>("Guess");
        backpack.addBook(new Book("Shantaram","Gregory David Roberts"));

        System.out.println(backpack);
    }
}