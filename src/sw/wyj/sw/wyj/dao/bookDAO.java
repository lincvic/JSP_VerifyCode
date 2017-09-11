package sw.wyj.sw.wyj.dao;

import sw.wyj.book.Book;
import sw.wyj.db.bookDB;

import java.util.List;

import static sw.wyj.db.bookDB.bookList;

/**
 * Created by 王一疆 on 2017/9/6
 */
public class bookDAO {
    public void addBook(Book book){
        bookDB.bookList.add(book);
    }
    public List<Book> getBooks(){
        return bookDB.bookList;
    }
    //删除一本书
    //按书名查找书
    //统计书籍总价
    //按照作者查找书
}
