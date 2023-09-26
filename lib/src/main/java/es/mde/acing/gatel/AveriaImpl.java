package es.mde.acing.gatel;

public class AveriaImpl extends IncidenciaImpl implements Averia{

	private String componente;
	private Boolean reparable;

	@Override
	public String getComponente() {
		return componente;
	}

	public void setComponente(String componente) {
		this.componente = componente;
	}

	@Override
	public Boolean isReparable() {
		return reparable;
	}

	public void setReparable(Boolean reparable) {
		this.reparable = reparable;
	}

	@Override
	public TipoIncidencia getTipoIncidencia() {
	    return TipoIncidencia.Averia;
	}

	@Override
	public String toString() {
		return "AveriaImpl [componente=" + componente + ", reparable=" + reparable + " Incidencia: " + super.toString() + "]";
	}

	
}