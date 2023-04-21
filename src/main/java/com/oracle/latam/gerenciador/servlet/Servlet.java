package com.oracle.latam.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/prueba")
public class Servlet extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter pwResponse= response.getWriter();
		pwResponse.println("<html>");
		pwResponse.println("<body>");
		pwResponse.println("<p> Esto es una prueba");
		pwResponse.println("</p>");
		pwResponse.println("</body>");
		pwResponse.println("</html>");
	}

}
