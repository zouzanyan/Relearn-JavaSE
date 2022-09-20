package 设计模式.迭代器模式;

public class Bookshelf implements Aggregate{

    private Book[] books;
    private int last;

    public Bookshelf(int maxSize){
        this.books = new Book[maxSize];
    }

    public Book getBookAt(int index){
        return books[index];
    }

    public void appendBook(Book book){
        this.books[last] = book;
        last++;
    }

    public int getLength(){
        return last;
    }



    @Override
    public Iterator iterator() {

        return new BookshelfIterator(this);
    }
}
