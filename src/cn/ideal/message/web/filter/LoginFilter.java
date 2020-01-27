package cn.ideal.message.web.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@WebFilter("/*")
public class LoginFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        //0.强制转换
        HttpServletRequest request = (HttpServletRequest) req;

        //1.获取资源请求路径
        String uri = request.getRequestURI();
        //2.判断是否包含登录相关资源路径,要注意排除掉 css/js/图片/验证码等资源
        if (uri.contains("/admin_login.html") || uri.contains("index.html") || uri.contains("/admin/login") || uri.contains(".css") || uri.contains(".jpg") || uri.contains(".jpeg") ||
                uri.contains(".js") || uri.contains("/fonts/") || uri.contains("/checkCode")) {
            //包含，用户就是想登录。放行
            chain.doFilter(req, resp);

        } else {
            //不包含，需要验证用户是否登录
            //3.从获取session中获取user
            Object admin = request.getSession().getAttribute("admin");
            if (admin != null) {
                //登录了。放行
                chain.doFilter(req, resp);
            } else {
                //没有登录。跳转登录页面
                request.getRequestDispatcher("/admin_login.html").forward(request, resp);
            }
        }
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
