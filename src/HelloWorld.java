import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by 47767573t on 05/04/16.
 */
public class HelloWorld extends HttpServlet {

    private String msgGlobal = "";
    private int cesarNum = 5;

    public HelloWorld() {
        super();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        PrintWriter pwOut;
        pwOut = resp.getWriter();


        resp.setContentType("text/html");

        pwOut.println("<html>");
        pwOut.println("<head><title> Practica M06 </title></head>");
        pwOut.println("<body>");
        pwOut.println("<h1> Práctica César </h1>");
        pwOut.println("<h2>Introduce palabra: </h2>");
        pwOut.println("<p><input type=\"text\" name=\"fraseInicial\"/><button>GO</button></p>");

        String[] frase = req.getParameterValues("fraseInicial");

        pwOut.println("<p>prueba</p>");

        for (int i = 0; i < cesarNum; i++) {

            String line = "<h3></h3>";
        }

        pwOut.println("</body></html>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    public void init() throws ServletException {
        msgGlobal = "HOLA GUORLD";

    }
}
