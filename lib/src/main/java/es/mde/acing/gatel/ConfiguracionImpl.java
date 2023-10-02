package es.mde.acing.gatel;

public class ConfiguracionImpl extends IncidenciaImpl implements Configuracion{

	private String aplicacion;

	@Override
	public String getAplicacion() {
		return aplicacion;
	}

	public void setAplicacion(String aplicacion) {
		this.aplicacion = aplicacion;
	}


	@Override
	public TipoIncidencia getTipoIncidencia() {
	    return TipoIncidencia.CONFIGURACION;
	}

	@Override
	public String toString() {
		return "ConfiguracionImpl [aplicacion=" + aplicacion + " Incidencia: " + super.toString() + "]";
	}

	

	
}