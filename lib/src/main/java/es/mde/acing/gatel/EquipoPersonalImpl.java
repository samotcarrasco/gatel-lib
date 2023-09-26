package es.mde.acing.gatel;


public class EquipoPersonalImpl extends EquipoImpl implements EquipoPersonal  {

	private MiembroGC titular;
    
    @Override
	public MiembroGC getTitular() {
		return titular;
	}

	public void setTitular(MiembroGC titular) {
		this.titular = titular;
	}

	@Override
	public TipoEquipo getTipoEquipo() {
			return TipoEquipo.EquipoPersonal;
	}

	@Override
	public String toString() {
		return "EquipoPersonalImpl [titular=" + titular + "Equpo: " + super.toString() + "]";
	}
	
}