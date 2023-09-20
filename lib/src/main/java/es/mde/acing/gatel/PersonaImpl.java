package es.mde.acing.gatel;

import java.util.List;


public class PersonaImpl implements Persona{

    String nombre;
    String apellidos;
    String telefono;
    String email;
    Perfil perfil;
    String nombreUsuario;
    String password;
    List<Incidencia> incidencias;
    
	public static enum Perfil {
		Estandar,
	    AdministradorUnidad,
	    AdministradorCentral,
	    Resolutor
	}	
	
	public static enum TipoPersona {
		MiembroGC,
		PersonalExterno
	}
	
    @Override
    public String getNombre() {
		return nombre;
	}
    
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
	public String getApellidos() {
		return apellidos;
	}
	
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	@Override
	public String getTelefono() {
		return telefono;
	}
	
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	@Override
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public Perfil getPerfil() {
		return perfil;
	}
	
	public void setPerfil(Perfil perfil) {
		this.perfil = perfil;
	}
	
	@Override
	public String getNombreUsuario() {
		return nombreUsuario;
	}
	
	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}
	
	@Override
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public List<Incidencia> getIncidencias() {
		return incidencias;
	}
	
	public void setIncidencias(List<Incidencia> incidencias) {
		this.incidencias = incidencias;
	}
     
	@Override
	public TipoPersona getTipoPersona() {
		//En las clases hijas(herecia) controlamos el valor del tipoModelo
		return null;
	}

	@Override
	public String toString() {
		return "PersonaImpl [nombre=" + nombre + ", apellidos=" + apellidos + ", telefono=" + telefono + ", email="
				+ email + ", perfil=" + perfil + ", nombreUsuario=" + nombreUsuario + ", password=" + password
				+ ", incidencias=" + incidencias + "]";
	}
    
}