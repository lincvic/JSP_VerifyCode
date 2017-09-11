package sw.wyj.servlet;

import sw.wyj.book.Book;
import sw.wyj.sw.wyj.dao.bookDAO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@WebServlet(name = "AddServlet",urlPatterns = "/AddServlet")

public class AddServlet extends HttpServlet {
    private bookDAO bookDAO=new bookDAO();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Book book= new Book();
        book.setBookName(request.getParameter("bookName"));
        book.setBookAuthor(request.getParameter("bookAuthor"));
        book.setBookPrice(Float.parseFloat(request.getParameter("bookPrice")));
        bookDAO.addBook(book);
        request.setAttribute("bookList",bookDAO.getBooks());
        request.getRequestDispatcher("showBook.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }

    @Override
    public void init() throws ServletException {
        super.init();
    }
}
