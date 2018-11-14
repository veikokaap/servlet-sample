package ee.veikokaap;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Antud klass on HttpServlet-i alam klass.
 * HttpServlet ise ei ole mingit moodi eriline,
 * vaid oluline on see, et Tomcat kasutab HttpServlet-i alamklasse,
 * mille sa oled web.xml failis talle ette öelnud.
 */
public class HelloServlet extends HttpServlet {
  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
    // Ütleme, et antud leht on html-i kujul
    response.setContentType("text/html");

    // Kirjutame midagi lehel
    response.getWriter().write("" +
        "<h1> Tere maailm! </h1>" +
        "<p> Väiksem maailm. </p>"
    );

  }
}
