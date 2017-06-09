package account;// Import required java libraries

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

// Extend HttpServlet class
public class AddUser extends HttpServlet {

    // HttpServletRequest to read the HTTP header infromation.
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // titel
        String title = "AddUser to application";

        String docType = "<!doctype html public \"-//w3c//dtd html 4.0 " +
                "transitional//en\">\n";

        String voornaam = request.getParameter("voornaam");
        String achternaam = request.getParameter("achternaam");
        String straatnaam = request.getParameter("straatnaam");
        String huisnummer = request.getParameter("huisnummer");
        String postcode = request.getParameter("postcode");
        String passwoord = request.getParameter("passwoord");
        String emailadres = request.getParameter("emailadres");

        PayToGetherApplication makeuser = new PayToGetherApplication();
        AccountCredentials terugkomstaccount = makeuser.accountForUser(voornaam, achternaam, straatnaam, huisnummer, postcode, passwoord, emailadres);


        if(terugkomstaccount != null){

            out.println(docType
                    + "<html>\n"
                    + "<head><title>" + title + "</title></head>\n"
                    + "<body bgcolor=\"#f0f0f0\">\n"
                    + "Het aanmelden is gelukt, u kunt nu inloggen ga naar de begin pagina"
                    + "Hier onder worden de gegevens weergeven: <br>"
                    + "<br>  Voornaam: " + request.getParameter("voornaam")
                    + "<br> Achternaam: " + request.getParameter("achternaam")
                    + "<br> Straatnaam: " + request.getParameter("straatnaam")
                    + "<br> huisnummer: " + request.getParameter("huisnummer")
                    + "<br> postcode: " + request.getParameter("postcode")
                    + "<br> passwoord: " + request.getParameter("passwoord")
                    + "<br> emailadres: " + request.getParameter("emailadres")
                    + "</body></html>");
        }else{
            out.println(docType
                    + "<html>\n"
                    + "<head><title>" + title + "</title></head>\n"
                    + "<body bgcolor=\"#f0f0f0\">\n"
                    + "Het aanmelden is NIET gelukt"
                    + "Hier onder worden de gegevens weergeven: <br>"
                    + "<br>  Voornaam: ERROR"
                    + "<br> Achternaam: ERROR"
                    + "<br> Straatnaam: ERROR"
                    + "<br> huisnummer: ERROR"
                    + "<br> postcode: ERROR"
                    + "<br> passwoord: ERROR"
                    + "<br> emailadres: " + request.getParameter("emailadres")
                    + "</body></html>");

        }

    }
}