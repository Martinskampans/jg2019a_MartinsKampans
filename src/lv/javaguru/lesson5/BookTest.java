package lv.javaguru.lesson5;

public class BookTest {

    //trūkst pārbaudes, kad grāmatas ir vienādas
    public static void main(String[] args) {

        Book book1 = new Book();
        book1.setAuthor("Bruce Eckel");
        book1.setTitle("Thinking in Java");
        book1.setPageCount(1057);

        Book book2 = new Book();
        book2.setAuthor("Kathy Sierra, Bert Bates");
        book2.setTitle("Head First Java");
        book2.setPageCount(688);

        System.out.println(book1);
        System.out.println("VS");
        System.out.println(book2);
        System.out.println("Equals result: " + book1.equals(book2));

    }
}
