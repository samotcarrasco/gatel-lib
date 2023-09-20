package es.mde.acing.gatel;


public class EquipoDeUnidadImpl extends EquipoImpl implements EquipoDeUnidad  {

    Unidad unidad;

    @Override
	public Unidad getUnidad() {
		return unidad;
	}

	public void setUnidad(Unidad unidad) {
		this.unidad = unidad;
	}
    
	@Override
	public TipoEquipo getTipoEquipo() {
			return TipoEquipo.EquipoDeUnidad;
	}

	@Override
	public String toString() {
		return "EquipoDeUnidadImpl [unidad=" + unidad + "Equpo: " + super.toString() + "]";
	}
	
	
	
	
}