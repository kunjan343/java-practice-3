import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "ServletGrommetFactory")
public class ServletGrommetFactory extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            boolean magentaGrommet = false;
            ArrayList<Grommet> grommets = new ArrayList<>();
            Grommet grommet = null;

            /* Red Symbol */
            int numRed = Integer.parseInt(request.getParameter("numRed"));
            String redSymbol = request.getParameter("redSymbol");
            for (int i = 0; i < numRed; i++) {
                grommet = new Grommet("red", redSymbol);
                grommets.add(grommet);
            }
            /* Blue symbol */
            int numBlue = Integer.parseInt(request.getParameter("numBlue"));
            String blueSymbol = request.getParameter("blueSymbol");
            for (int i = 0; i < numBlue; i++) {
                grommet = new Grommet("blue", blueSymbol);
                grommets.add(grommet);
            }
            /* Green symbol */
            int numGreen = Integer.parseInt(request.getParameter("numGreen"));
            String greenSymbol = request.getParameter("greenSymbol");
            for (int i = 0; i < numGreen; i++) {
                grommet = new Grommet("green", greenSymbol);
                grommets.add(grommet);
            }

            int totalGrommet = numRed + numBlue + numGreen;
            if (totalGrommet > 20) {
                grommet = new Grommet("magenta", "#");
                grommets.add(grommet);
            }

            request.setAttribute("grommets", grommets);
            request.getRequestDispatcher("view.jsp").forward(request, response);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
