package fr.gtm.demo.servlet;

import java.io.IOException;
import java.io.Writer;
import java.util.Enumeration;
import java.util.logging.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/HelloServlet")
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final Logger LOG = Logger.getLogger("DEMO");

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Writer out = response.getWriter();
		String nom = request.getParameter("nom");
		if(nom==null) {
			nom = "Francis";
		}
		String message = "bonjour, "+nom;
		request.setAttribute("message", message);
		RequestDispatcher rd = this.getServletContext().getRequestDispatcher("/show.jsp");
		rd.forward(request, response);
	}
	
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
