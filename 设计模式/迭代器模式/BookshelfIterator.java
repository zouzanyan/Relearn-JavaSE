package 设计模式.迭代器模式;

public class BookshelfIterator implements Iterator{

    private Bookshelf bookshelf;
    private int index;

    BookshelfIterator(Bookshelf bookshelf){
        this.bookshelf = bookshelf;
        this.index = 0;
    }

    @Override
    public Object next() {
        Book book = bookshelf.getBookAt(index);
        index++;
        return book;
    }

    @Override
    public boolean hasNext() {
        if (index < bookshelf.getLength()){
            return true;
        }else {
            return false;
        }
    }
}
