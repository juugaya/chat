package tomcatsample;

import javax.servlet.http.HttpServlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Chat1 extends HttpServlet {
    StringBuffer message = new StringBuffer("");

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html; charset=iso-2022-jp");
        PrintWriter out = response.getWriter();

        if (request.getParameter("name") != null) {
            message.append("<p>");
            message.append(request.getParameter("name"));
            message.append(" > ");
            message.append(request.getParameter("message"));
            message.append("</p>");
        }
        if (request.getParameter("reset") != null
                && request.getParameter("reset").equals("true")) {
            message.delete(0, message.length());
        }

        out.println("<html>");
        out.println("<head><title>ChatTool</title></head>");
        out.println("<body><h1>CHAT</h1>");
        out.println("    <form action='Chat11'>");
        out.println("        名前： <input type='text' name='name' size='10'/>");
        out.println("        <br/>");
        out.println("        メッセージ： <input type='text' name='message' value='' size='40'/>");
        out.println("        <br/>");
        out.println("        <input type='submit' value='送信'/>");
        out.println("        <input type='reset' value='クリア'/>");
        out.println("    </form>");
        out.println("    <form action='Chat11'>");
        out.println("        <input type='hidden' name='reset' value='true'/>");
        out.println("        <input type='submit' value='履歴クリア'/>");
        out.println("    </form>");
        out.println("    <hr/>");
        out.println(message);
        out.println("</body>");
        out.println("</html>");

        out.close();
    }
}
