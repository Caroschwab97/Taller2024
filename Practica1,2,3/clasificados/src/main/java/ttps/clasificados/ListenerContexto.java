package ttps.clasificados;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;


@WebListener
public class ListenerContexto implements ServletContextListener {
	
	 public void contextDestroyed(ServletContextEvent sce) {  }
	 
	 public void contextInitialized(ServletContextEvent sce) {
		 
		 String sitio = sce.getServletContext().getInitParameter("sitio");
		 String email = sce.getServletContext().getInitParameter("email");
		 String telefono = sce.getServletContext().getInitParameter("telefono");
		 
		 SitioClasificado SC = new SitioClasificado(sitio,email,telefono);
		 sce.getServletContext().setAttribute("sitioClasificado", SC);
	 }
}
