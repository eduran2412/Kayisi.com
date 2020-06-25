/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filter;

import entity.Firma;
import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Furkan
 */
@WebFilter("/*")
public class LoginFilter implements Filter {

    @Override
    public void init(FilterConfig fc) throws ServletException {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse res = (HttpServletResponse) response;

        String url = req.getRequestURI();
        Firma f = (Firma) req.getSession().getAttribute("user");

        if (f == null) {
            if (url.contains("admin") || url.contains("isciSec") || url.contains("isciSecilen") || url.contains("firmaCikis")) {
                res.sendRedirect(req.getContextPath() + "/index.xhtml");
            } else {
                chain.doFilter(request, response);
            }

        } else {
            if (f.getKullaniciAdi().equals("Admin")) {
                if (url.contains("firmaGiris")) {
                    res.sendRedirect(req.getContextPath() + "/admin/admin.xhtml");
                } else if (url.contains("firmaCikis")) {
                    req.getSession().invalidate();
                    res.sendRedirect(req.getContextPath() + "/index.xhtml");
                } else {
                    chain.doFilter(request, response);
                }
            } else {
                if (url.contains("admin") || url.contains("firmaGiris")) {
                    res.sendRedirect(req.getContextPath() + "/firma/isciSec.xhtml");
                } else if (url.contains("firmaCikis")) {
                    req.getSession().invalidate();
                    res.sendRedirect(req.getContextPath() + "/index.xhtml");
                } else {
                    chain.doFilter(request, response);
                }
            }

        }

    }

    @Override
    public void destroy() {
    }

}
