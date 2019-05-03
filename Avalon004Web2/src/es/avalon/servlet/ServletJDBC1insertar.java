package es.avalon.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import es.avalon.miproyecto.persistencia.Ordenador;

@WebServlet("/ServletJDBC1")
public class ServletJDBC1insertar extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		List<Ordenador> lista = Ordenador.buscarTodos();
		PrintWriter pw = response.getWriter();
		pw.print("<html><body>");
		for (Ordenador o : lista) {

			pw.write("<p>" + o.getModelo() + " " + o.getMarca() + " " + o.getPrecio() + "</p>");
		}

		pw.println("<a href='formulario.html'>ir al formulario<a/>");

		pw.println("</body></html>");
	}

}
