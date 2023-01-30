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
public class arithmeticCalculatorServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
       getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp")
               .forward(request, response);
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        
            String First = request.getParameter("firstNum");
            String Second = request.getParameter("secondNum");
            String Calculation = request.getParameter("Calculation");
         
            request.setAttribute("firstNum", First);
            request.setAttribute("secondNum", Second );
             
            if (First == null || First.equals("") || Second==null || Second.equals("")) {
            request.setAttribute("message", "Result: Invalid");
       getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp")
               .forward(request, response);
            return;       
        }

            try {
                
           int firstNumber = Integer.parseInt(First);
           int secondNumber = Integer.parseInt(Second);
           int result=0;
            
           
            if (Calculation.equals("+")) {
                result= firstNumber+secondNumber;
            }
            
            if (Calculation.equals("-")) {
                result= firstNumber-secondNumber;
            }
            if (Calculation.equals("*")) {
                result= firstNumber*secondNumber;
            }    
            if (Calculation.equals("%")) {
                result= firstNumber%secondNumber;
            }
            
            request.setAttribute("message", "Result: " + result);
       getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp")
               .forward(request, response);  
            }
            
         catch (Exception e)   {
            request.setAttribute("firstNum", First);
            request.setAttribute("secondNum", Second );
            request.setAttribute("message", "Result: Invalid");
       getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp")
               .forward(request, response);  
         }
       
           
    
    }

}
