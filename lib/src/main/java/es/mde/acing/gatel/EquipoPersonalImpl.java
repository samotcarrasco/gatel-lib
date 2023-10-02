package es.mde.acing.gatel;

public abstract class EquipoPersonalImpl extends EquipoImpl implements EquipoPersonal  {


	@Override
	public TipoEquipo getTipoEquipo() {
	     return TipoEquipo.EQUIPO_PERSONAL;
    }

	
	@Override
	public String toString() {
		return "Equipo [ " + super.toString() + "]";
	}
	
	
}