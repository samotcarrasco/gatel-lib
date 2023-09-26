package es.mde.acing.gatel;

import es.mde.acing.gatel.EquipoImpl.TipoEquipo;

public abstract class EquipoPersonalImpl extends EquipoImpl implements EquipoPersonal  {


	@Override
	public TipoEquipo getTipoEquipo() {
	     return TipoEquipo.EquipoPersonal;
    }

	
	@Override
	public String toString() {
		return "Equipo [ " + super.toString() + "]";
	}
	
	
}