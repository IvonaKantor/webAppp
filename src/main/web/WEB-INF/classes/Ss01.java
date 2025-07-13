import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Ss01 extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public Ss01() {
        super();
        System.out.println("Ss01");
    }

    public void init(ServletConfig config) throws ServletException {
        System.out.println("init");
    }

    public void destroy() {
        System.out.println("destroy");
    }

    protected void service(HttpServletRequest request, HttpServletResponce responce) throws ServletException, IOException {
        System.out.println("service");
    }
}