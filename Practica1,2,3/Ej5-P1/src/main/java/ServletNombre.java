

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import javax.servlet.annotation.WebInitParam;



/**
 * Servlet implementation class premio
 */
@WebServlet(urlPatterns = {"/ServletNombre"}, 
initParams = { @WebInitParam(name = "saludo", value = "¡Felicitaciones @! eres el visitante número # de nuestro sitio y has sido seleccionado para el gran premio TTPS- Cursada APROBADA")})
public class ServletNombre extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private int contador=0;
	private String saludo;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletNombre() {
        super();
        // TODO Auto-generated constructor stub
    }

    
	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		super.init(config);
		saludo = getServletConfig().getInitParameter("saludo");
	}


	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		contador++;
		String nombre = request.getParameter("nombre");	
		String modificado1 = saludo.replace("@", nombre);
		String modificado2 = modificado1.replace("#", String.valueOf(contador));
		PrintWriter out = response.getWriter();
		out.print("<html><body>");
		out.print("<h1>"+ modificado2 +"</h1>");
		out.print("</body></html>");
		out.close();
	}


}
