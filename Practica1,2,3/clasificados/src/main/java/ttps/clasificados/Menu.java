package ttps.clasificados;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Menu
 */
@WebServlet(urlPatterns = {"/Menu"})
public class Menu extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Menu() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		Usuario usuario = (Usuario) request.getAttribute("usuario");
		String perfil = (String) request.getAttribute("perfil");
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.println("<h1>Bienvenido, " + usuario.getUsuario() + "</h1>");
		out.println("<h1>Perfil:  " + perfil + "</h1>");
		
        RequestDispatcher dispatcher = request.getRequestDispatcher("/Encabezado");
        StringWriter writer = new StringWriter();
        
        dispatcher.include(request, response);
        
        PrintWriter currentOut = response.getWriter();
        currentOut.println(writer.toString());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
