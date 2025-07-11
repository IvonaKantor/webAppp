import java.io.IOException;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/Sso1")
public class Ss01 extends HttpServlet {

    public Ss01() {
        System.out.println("Ss01:constructor");
    }

    public void init(ServletConfig config) throws ServletException {
        System.out.println("Ss01:init");
    }

    public void destroy() {
        System.out.println("Ss01:destroy");
    }

    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("Ss01:service");
    }
}