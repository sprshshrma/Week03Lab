package Servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Sparsh
 */
public class ageCalculatorServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
       getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp")
               .forward(request, response);
       
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

         String AGE = request.getParameter("AGE");
         String message = "";
  
        request.setAttribute("AGE", AGE);
        
        if (AGE == null || AGE.equals("")) {
            request.setAttribute("message", "You must give your current age");
       getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp")
               .forward(request, response); 
            
       return;
        }
        
        try
        {
            int ageCon = Integer.parseInt(AGE);
            if (ageCon > 0)
            {
                message = "Your next birthday will be: " + (ageCon + 1);
                
            }
            else
            { 
                 message = "You must give your current age";
            }
            
         }
        catch (Exception e)
        {
                 message = "You must give your current age";
        }
        
        request.setAttribute("message",  message);
       getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp")
               .forward(request, response); 
    }

}


