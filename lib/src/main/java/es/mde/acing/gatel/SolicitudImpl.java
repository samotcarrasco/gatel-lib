package es.mde.acing.gatel;

public class SolicitudImpl extends IncidenciaImpl implements Solicitud{

	private String aceptacion;

	@Override
	public String isAceptado() {
		return aceptacion;
	}

	public void setAcpetado(String aceptacion) {
		this.aceptacion = aceptacion;
	}

	@Override
	public TipoIncidencia getTipoIncidencia() {
	    return TipoIncidencia.SOLICITUD;
	}

	@Override
	public String toString() {
		return "SolicitudImpl [acpetacion=" + aceptacion + " Incidencia: " + super.toString() + "]";
	}

	

	
}