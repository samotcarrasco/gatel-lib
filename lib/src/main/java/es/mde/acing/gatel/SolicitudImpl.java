package es.mde.acing.gatel;

public class SolicitudImpl extends IncidenciaImpl implements Solicitud{

	private Boolean aceptado;

	@Override
	public Boolean isAceptado() {
		return aceptado;
	}

	public void setAcpetado(Boolean acpetado) {
		this.aceptado = acpetado;
	}

	@Override
	public TipoIncidencia getTipoIncidencia() {
	    return TipoIncidencia.SOLICITUD;
	}

	@Override
	public String toString() {
		return "SolicitudImpl [acpetacion=" + aceptado + " Incidencia: " + super.toString() + "]";
	}

	

	
}