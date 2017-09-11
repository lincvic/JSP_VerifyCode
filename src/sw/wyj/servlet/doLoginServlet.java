package sw.wyj.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by 王一疆 on 2017/9/5
 */
@WebServlet(name = "doLoginServlet",urlPatterns = "/doLoginServlet")
public class doLoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username=request.getParameter("username");
        String psw=request.getParameter("psw");
        HttpSession session=request.getSession();
        if(username!=null&&username.equals("admin")&&psw!=null&&psw.equals("admin")){
            session.setAttribute("username",username);
            session.setAttribute("psw",psw);
            response.sendRedirect("loginSuccess.jsp");
        }else{
            request.getRequestDispatcher("loginError.jsp").forward(request,response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
