package com.alura.gerenciador.servlet;

import java.io.IOException;

import com.alura.gerenciador.accion.Accion;
import com.alura.gerenciador.modelo.Usuario;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

//@WebServlet("/entrada")
public class UnicaEntradaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession();
		System.out.println("\n" + session);
		
		String stringAccion = request.getParameter("accion");
		String nombreClase = "com.alura.gerenciador.accion." + stringAccion;
		String result = "";
		
		Usuario usuarioLogin = (Usuario) session.getAttribute("usuarioDB");
		
		try {
			Class clase = Class.forName(nombreClase);
			Object obj = clase.newInstance();
			Accion accion = (Accion) obj;
			
			if (stringAccion.equals("formIngresarUsuario") || stringAccion.equals("IngresarUsuario") || usuarioLogin != null){
				System.out.println(1);
				result = accion.ejecutar(request, response);
			} else {
				System.out.println(2);
				RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/view/formIngresarUsuario.jsp");
				rd.forward(request, response);
				return;
			}
				
				
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | ServletException
				| IOException e) {
			throw new ServletException(e);
		}

		String[] tipoDireccion = result.split(":");
		
		if (tipoDireccion[0].equals("forward")) {
			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/view/" + tipoDireccion[1]);
			rd.forward(request, response);
		} else if (tipoDireccion[0].equals("redirect")) {
			response.sendRedirect(tipoDireccion[1]);
		}

	}
}
