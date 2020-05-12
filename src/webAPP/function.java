package webAPP;
import bean.stamp;
import dao.stampRepo;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

@WebServlet(name = "function")
public class function extends HttpServlet {

    stampRepo repo = new stampRepo();

        protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

            Date time = new Date();
            stamp stampObject = new stamp(String.valueOf(time));

            request.setAttribute("time", time);
            request.getRequestDispatcher("/response.jsp").forward(request, response);
            repo.create(stampObject);
        }

    }
