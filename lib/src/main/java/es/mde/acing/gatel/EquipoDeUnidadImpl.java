package es.mde.acing.gatel;

import es.mde.acing.gatel.ModeloImpl.TipoModelo;

public abstract class EquipoDeUnidadImpl extends EquipoImpl implements EquipoDeUnidad  {

	@Override
	public TipoEquipo getTipoEquipo() {
	     return TipoEquipo.EquipoDeUnidad;
    }

	
	@Override
	public String toString() {
		return "Equipo [ " + super.toString() + "]";
	}
	
}