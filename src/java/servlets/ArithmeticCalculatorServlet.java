package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Jean
 */
public class ArithmeticCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("result", "---");
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                .forward(request, response);
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String first = request.getParameter("first");
        String second = request.getParameter("second");
        
        int result = 0;
        
        try {
            int firstnum = Integer.parseInt(first);
            int secondnum = Integer.parseInt(second);
            
            String operation = request.getParameter("submit");
            
            switch (operation)
            {
                case "+":
                    result = firstnum + secondnum;
                    break;
                case "-":
                    result = firstnum - secondnum;
                    break;
                case "*":
                    result = firstnum * secondnum;
                    break;
                case "%":
                    result = firstnum % secondnum;
                    break;
            }
            
            request.setAttribute("result", result);
        }
        catch (Exception e) {
            
            request.setAttribute("result", "Invalid.");
        }
        
        request.setAttribute("firstnum", first);
        request.setAttribute("secondnum", second);
        
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                .forward(request, response);
    }


}
