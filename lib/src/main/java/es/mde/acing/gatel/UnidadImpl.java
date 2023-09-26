package es.mde.acing.gatel;

import java.util.List;

public class UnidadImpl implements Unidad{

	private String nombre;
	private String codigoUnidad;
	private String correoOficial;
	private String telefono;
	private List<EquipoDeUnidad> listaEquiposUnidad;
	private List<MiembroGC> listaMiembrosGC;
	
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
	public List<EquipoDeUnidad> getListaEquiposUnidad() {
		return listaEquiposUnidad;
	}
    
	public void setListaEquiposUnidad(List<EquipoDeUnidad> listaEquiposUnidad) {
		this.listaEquiposUnidad = listaEquiposUnidad;
	}

    @Override
    public List<MiembroGC> getListaMiembrosGC() {
		return listaMiembrosGC;
	}
    
	public void setListaMiembrosGC(List<MiembroGC> listaMiembrosGC) {
		this.listaMiembrosGC = listaMiembrosGC;
	}

	@Override
	public String toString() {
		return "UnidadImpl [nombre=" + nombre + ", codigoUnidad=" + codigoUnidad + ", correoOficial=" + correoOficial
				+ ", telefono=" + telefono + ", listaEquiposUnidad=" + listaEquiposUnidad + ", listaMiembrosGC="
				+ listaMiembrosGC + "]";
	}

}
