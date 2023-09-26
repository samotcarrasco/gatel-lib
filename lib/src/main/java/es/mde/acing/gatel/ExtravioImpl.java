package es.mde.acing.gatel;

public class ExtravioImpl extends IncidenciaImpl implements Extravio{

	private String ultimaUbicacion;
	private Boolean encontrado;
	private Boolean bloqueado;
	private Boolean borrado;
		
	@Override
	public String getUltimaUbicacion() {
		return ultimaUbicacion;
	}

	public void setUltimaUbicacion(String ultimaUbicacion) {
		this.ultimaUbicacion = ultimaUbicacion;
	}

	@Override
	public Boolean isEncontrado() {
		return encontrado;
	}

	public void setEncontrado(Boolean encontrado) {
		this.encontrado = encontrado;
	}

	@Override
	public Boolean isBloqueado() {
		return bloqueado;
	}

	public void setBloqueado(Boolean bloqueado) {
		this.bloqueado = bloqueado;
	}

	@Override
	public Boolean isBorrado() {
		return borrado;
	}

	public void setBorrado(Boolean borrado) {
		this.borrado = borrado;
	}

	@Override
	public TipoIncidencia getTipoIncidencia() {
	    return TipoIncidencia.Extravio;
	}

	@Override
	public String toString() {
		return "ExtravioImpl [ultimaUbicacion=" + ultimaUbicacion + ", encontrado=" + encontrado + ", bloqueado="
				+ bloqueado + ", borrado=" + borrado + " Incidencia: " + super.toString() + "]";
	}
	
	

}