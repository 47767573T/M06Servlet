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
    private int NUMERO_CESAR = 5;
    private String line = "<h3></h3>";

    public HelloWorld() {
        super();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        PrintWriter pwOut;
        pwOut = resp.getWriter();
        String frase = req.getParameter("frase");

        String msgGlobal;


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        PrintWriter pwOut;
        pwOut = resp.getWriter();

        String cesarIni = req.getParameter("frase");
        String cesarN = "";
        String cesarXml = "";

        for (int i = 0; i < NUMERO_CESAR; i++) {

            cesarN = cesarFrase(cesarN);
            cesarXml += "\n<h3>"+cesarN+"</h3>";
            pwOut.println(cesarXml);
        }
        pwOut.println("</body></html>");
    }

    @Override
    public void init() throws ServletException {
        msgGlobal = "HOLA GUORLD";
    }

    public String cesarFrase (String fraseInicial){
        String fraseFinal = "";
        fraseInicial.toLowerCase();

        for (int i = 0; i < fraseInicial.length(); i++) {
            char c = ' ';
            int charAscii = fraseInicial.codePointAt(i);

            if(fraseInicial.charAt(i) == ' ')  c = ' ';
            else if (charAscii > 96 && charAscii < 122)  c = (char)(charAscii+1);
            else if (charAscii == 122)  c = 'a';

            fraseFinal += c;
        }
        return fraseFinal;
    }

}
