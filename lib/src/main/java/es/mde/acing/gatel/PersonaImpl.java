package es.mde.acing.gatel;

import java.util.List;


public class PersonaImpl implements Persona{

	private String nombre;
	private String apellidos;
	private String telefono;
	private String email;
	private Perfil perfil;
	private String nombreUsuario;
	private String password;
	private List<EquipoPersonal> equiposPersonales;
	private Unidad unidad;	
	private List<Incidencia> incidencias;
	
	public static enum TipoPersona {
		MIEMBRO_GC,
		PERSONAL_EXTERNO
	}
	
	public static enum Perfil {
		ADMIN_CENTRAL,
		ADMIN_UNIDAD,
		USUARIO,
		RESOLUTOR
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
	public List<EquipoPersonal> getEquiposPersonales() {
		return equiposPersonales;
	}
    
	public void setEquiposPersonales(List<EquipoPersonal> equiposPersonales) {
		this.equiposPersonales = equiposPersonales;
	}
	
	public Unidad getUnidad() {
		return unidad;
	}

	public void setUnidad(Unidad unidad) {
		this.unidad = unidad;
	}

	@Override
	public TipoPersona getTipoPersona() {
		//En las clases hijas(herecia) controlamos el valor del tipoModelo
		return null;
	}

	@Override
	public String toString() {
		return "PersonaImpl [nombre=" + nombre + ", apellidos=" + apellidos + ", telefono=" + telefono + ", email="
				+ email + ", perfil=" + perfil + ", nombreUsuario=" + nombreUsuario + ", password=" + password ;
			//	+ ", incidencias=" + incidencias + "]";
	}
    
}