

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ttps.clasificados.SitioClasificado;

/**
 * Servlet implementation class Encabezado
 */
@WebServlet(urlPatterns = {"/Encabezado"})
public class Encabezado extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Encabezado() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		SitioClasificado sitio = (SitioClasificado) getServletContext().getAttribute("sitioClasificado");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<h1>Informacion del listener: </h1>");
		out.println("<h1>Sitio:  " + sitio.getSitio() + "</h1>");
		out.println("<h1>Email: " + sitio.getEmail() + "</h1>");
		out.println("<h1>Telefono:  " + sitio.getTelefono() + "</h1>");
	}


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
