package tomcatsample;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class ServletTest1 extends HttpServlet {

     protected void doGet(
          HttpServletRequest req, 
          HttpServletResponse resp)
               throws ServletException, IOException {
          
          PrintWriter w = resp.getWriter();
          w.println("Hello, Servlet!");
          
     }
     
}