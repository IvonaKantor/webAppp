import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("Ss01")
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

    protected void service(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException
    {
        System.out.println("service");
    }


    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String protocol = req.getProtocol();
        String msg = "http.method_get_not_supported";
        resp.sendError(400, msg);
    }
}