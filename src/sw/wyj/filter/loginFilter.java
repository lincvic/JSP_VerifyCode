package sw.wyj.filter;

import com.sun.deploy.net.HttpRequest;
import com.sun.tools.internal.ws.wsdl.document.http.HTTPOperation;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by 王一疆 on 2017/9/5
 */
@WebFilter(filterName = "loginFilter",urlPatterns = "/AddServlet")
public class loginFilter implements Filter {
    public void destroy() {
    }


    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        HttpServletRequest request=(HttpServletRequest)req;
        HttpSession session = request.getSession();
        if(session.getAttribute("username")!=null){
            chain.doFilter(req, resp);
        }else{
            request.getRequestDispatcher("login.jsp").forward(request,resp);
        }
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
