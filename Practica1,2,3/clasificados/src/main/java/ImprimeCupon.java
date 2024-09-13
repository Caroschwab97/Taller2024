

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.OutputStream;
import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ImprimeCupon
 */
@WebServlet(urlPatterns = {"/ImprimeCupon"})
public class ImprimeCupon extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ImprimeCupon() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String texto = request.getParameter("texto");	
		
		OutputStream outputStream = response.getOutputStream();
		BufferedImage image = new BufferedImage(500, 300, BufferedImage.TYPE_INT_BGR);
		Graphics2D gra = image.createGraphics();
		gra.setBackground(Color.WHITE);
		gra.clearRect(0, 0, 500, 300);
		gra.setFont(new Font("TimesRoman", Font.BOLD, 14));
		gra.setColor(Color.DARK_GRAY);
		gra.drawString(texto, 30, 30);
		
		BufferedImage img = ImageIO.read(this.getServletContext().getResourceAsStream("/WEB-INF/cupon3.jpg"));
		gra.drawImage(img, 40, 80, null, null);
		
		 javax.imageio.ImageIO.write(image, "jpg", outputStream);
		 outputStream.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
