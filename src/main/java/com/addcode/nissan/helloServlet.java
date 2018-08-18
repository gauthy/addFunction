package com.addcode.nissan;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.omg.CORBA.DynAnyPackage.Invalid;

/**
 * Servlet implementation class helloServlet
 */
public class helloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public helloServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String str1= request.getParameter("TextBox1");
		String str2=request.getParameter("TextBox2");
		Double num1 = 0.0,num2 = 0.0;
		boolean numeric=true;
		 try {
	             num1 = Double.parseDouble(str1);
	        } catch (NumberFormatException e) {
	            numeric = false;
	        }
		 try {
	           num2 = Double.parseDouble(str2);
	        } catch (NumberFormatException e) {
	            numeric = false;
	        }
		if(!numeric){
			PrintWriter writer = response.getWriter();
			writer.println("<h1> " + "Invalid Input" + "</h1>");
			writer.close();		
		}
		else{
			PrintWriter writer = response.getWriter();
			writer.println("<h1> " + (num1+num2) + "</h1>");
			writer.close();
		}
		
	
	}

}
