package ttps.clasificados;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
@WebServlet(urlPatterns = {"/login"})
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private List<Usuario> user;

	
	
    @Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
		user = new ArrayList<>();
		
		user.add(new Usuario("caro", "1234", "administrador"));
        user.add(new Usuario("home", "5678", "cliente"));
	}

	/**
     * Default constructor. 
     */
    public Login() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String usuario = request.getParameter("nombre");
		
		Optional<Usuario> usuarioEncontrado = user.stream()
	            .filter(datosUser -> datosUser.getUsuario().equals(usuario))
	            .findFirst();
		
		if (usuarioEncontrado.isEmpty()) {
			response.sendRedirect("error.html");
			return;
		}
		
		Usuario userEncontrado = usuarioEncontrado.get();
		String perfilUser = userEncontrado.getPerfil();
		
		request.setAttribute("usuario", userEncontrado); 
        request.setAttribute("perfil", perfilUser);
        
        RequestDispatcher dispatcher = request.getRequestDispatcher("/Menu");
        dispatcher.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
