
package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Jean
 */
public class AgeCalculatorServlet extends HttpServlet {

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp")
                .forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String message = "";
        String ageString = request.getParameter("age");
        if (ageString != ""){
            
            try {
            int age = Integer.parseInt(ageString);
            int nextAge = age + 1;
            
            message = "Your age next birthday will be " + nextAge + "."; 
        }
        catch (Exception e) {
            message = "You must enter a number.";
        }
        }
        else {
            message = "You must give your current age.";
        }
        
        request.setAttribute("message", message);
            
            getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp")
                    .forward(request, response);

    }

}
