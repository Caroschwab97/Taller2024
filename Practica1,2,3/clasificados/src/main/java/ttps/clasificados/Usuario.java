package ttps.clasificados;

public class Usuario {
	private String usuario;
	private String contraseña;
	private String perfil;
	public Usuario(String usuario, String contraseña, String perfil) {
		super();
		this.usuario = usuario;
		this.contraseña = contraseña;
		this.perfil = perfil;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getContraseña() {
		return contraseña;
	}
	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	public String getPerfil() {
		return perfil;
	}
	public void setPerfil(String perfil) {
		this.perfil = perfil;
	}
	
	
}
