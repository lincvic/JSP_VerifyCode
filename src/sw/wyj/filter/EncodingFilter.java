package sw.wyj.filter;

import org.omg.IOP.Encoding;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
import java.io.IOException;

@WebFilter(filterName = "EncodingFilter",urlPatterns = "/AddServlet")
@WebInitParam(name ="Encoding",value="utf-8")

public class EncodingFilter implements Filter {
    protected FilterConfig config;
    protected String Encoding;
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        chain.doFilter(req, resp);
    }

    public void init(FilterConfig config) throws ServletException {
        Encoding=config.getInitParameter("Encoding");

    }

}
