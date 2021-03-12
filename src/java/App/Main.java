package App;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/Main")
public class Main extends HttpServlet {

    private static final long serialVersionUID = 1L;

    public Main() {
        super();
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if (request.getParameter("calc") != null) {
            Result result = null;
            try {
                double x = Double.parseDouble(request.getParameter("x"));
                double a = Double.parseDouble(request.getParameter("a"));
                double b = Double.parseDouble(request.getParameter("b"));
                if (x > 5) {
                    double y = ((5 * a * b) / (x * x + a * a));
                    result = new Result(y);
                } else {
                    double y = (4 * (a + b - x) * (a + b - x));
                    result = new Result(y);
                }
            } catch (Exception e) {
            }
            request.setAttribute("result", result);
            request.getRequestDispatcher("/result.jsp").forward(request, response);
        }
    }
}
