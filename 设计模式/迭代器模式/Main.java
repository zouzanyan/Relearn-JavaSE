package 设计模式.迭代器模式;

public class Main {
    public static void main(String[] args) {
        Bookshelf bookshelf = new Bookshelf(5);
        bookshelf.appendBook(new Book("zouzanyan"));
        bookshelf.appendBook(new Book("love"));

        Iterator it = bookshelf.iterator();
        while (it.hasNext()){
            Book book = (Book)it.next();
            System.out.println(book.getName());
        }

    }
}
