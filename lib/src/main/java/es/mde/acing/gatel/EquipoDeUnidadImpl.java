package es.mde.acing.gatel;

public abstract class EquipoDeUnidadImpl extends EquipoImpl implements EquipoDeUnidad  {

	@Override
	public TipoEquipo getTipoEquipo() {
	     return TipoEquipo.EQUIPO_UNIDAD;
    }

	
	@Override
	public String toString() {
		return "Equipo [ " + super.toString() + "]";
	}
	
}