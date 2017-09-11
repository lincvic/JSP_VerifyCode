package sw.wyj.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * Created by 王一疆 on 2017/9/10
 */
@WebFilter(filterName = "identifyFilter",urlPatterns = "/doLoginServlet")
public class identifyFilter implements Filter {
    public void destroy() {
    }
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        String checkcode=req.getParameter("checkcode");
        HttpServletRequest request=(HttpServletRequest)req;
        System.out.print(request.getSession().getAttribute("verifyCode"));
        if(checkcode.equals(request.getSession().getAttribute("verifyCode"))){
            chain.doFilter(req, resp);
        }
        else{
            request.getRequestDispatcher("verifyError.jsp").forward(req,resp);
        }
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
