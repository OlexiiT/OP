package lab5;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Calculator extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Answer</title>");
            out.println("</head>");
            out.println("<body>");

            try {
                HashMap ans = DataProcessor.count(request);
                out.println("a: " + ans.get("a") + ", b: " + ans.get("b")
                        + ", c: " + ans.get("c") + ", d: " + ans.get("d")
                        + ", taskNumber: " + ans.get("task") + "; result = " + ans.get("answer"));
            } catch (TaskNotFoundException ex) {
                out.println("<p>Exception! " + ex.getMessage() + "</p>");
            } catch (NumberFormatException ex){
                out.println("<p>Exception! Parameters are incorrect!</p>");
            } finally {
                out.println("<p><a href=\"index.jsp\">Go back</a></p>");
            }

            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
        }
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
