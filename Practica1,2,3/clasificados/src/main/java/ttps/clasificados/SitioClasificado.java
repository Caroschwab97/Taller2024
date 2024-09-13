package ttps.clasificados;

public class SitioClasificado {

	private String sitio;
	private String email;
	private String telefono;
	
	
	public SitioClasificado(String sitio, String email, String telefono) {
		super();
		this.sitio = sitio;
		this.email = email;
		this.telefono = telefono;
	}


	public String getSitio() {
		return sitio;
	}


	public void setSitio(String sitio) {
		this.sitio = sitio;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	
}
