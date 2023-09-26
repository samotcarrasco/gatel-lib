package es.mde.acing.gatel;

import java.util.List;

public class UnidadImpl implements Unidad{

	private String nombre;
	private String codigoUnidad;
	private String correoOficial;
	private String telefono;
	private List<EquipoDeUnidad> equiposDeUnidad;
	//private List<MiembroGC> listaMiembrosGC;
	
    @Override
    public String getNombre() {
		return nombre;
	}
    
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

    @Override
    public String getCodigoUnidad() {
		return codigoUnidad;
	}
	
    public void setCodigoUnidad(String codigoUnidad) {
		this.codigoUnidad = codigoUnidad;
	}

    @Override
    public String getCorreoOficial() {
		return correoOficial;
	}
    
	public void setCorreoOficial(String correoOficial) {
		this.correoOficial = correoOficial;
	}

    @Override
    public String getTelefono() {
		return telefono;
	}
    
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
    @Override
	public List<EquipoDeUnidad> getEquiposDeUnidad() {
		return equiposDeUnidad;
	}
    
	public void setListaEquiposUnidad(List<EquipoDeUnidad> equiposDeUnidad) {
		this.equiposDeUnidad = equiposDeUnidad;
	}

//    @Override
//    public List<MiembroGC> getMiembrosGC() {
//		return listaMiembrosGC;
//	}
//    
//	public void setMiembrosGC(List<MiembroGC> listaMiembrosGC) {
//		this.listaMiembrosGC = listaMiembrosGC;
//	}

	@Override
	public String toString() {
		return "UnidadImpl [nombre=" + nombre + ", codigoUnidad=" + codigoUnidad + ", correoOficial=" + correoOficial
				+ ", telefono=" + telefono  ;
	}

}
