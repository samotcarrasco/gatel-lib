package es.mde.acing.gatel;

public class MiembroGCImpl extends PersonaImpl implements MiembroGC {

	private String tip;
	private String empleo;
    
	
    @Override
    public String getTip() {
		return tip;
	}
    
	public void setTip(String tip) {
		this.tip = tip;
	}
	
	@Override
    public String getEmpleo() {
		return empleo;
	}
	
	public void setEmpleo(String empleo) {
		this.empleo = empleo;
	}
	
	@Override
	public TipoPersona getTipoPersona() {
	    return TipoPersona.MIEMBRO_GC;
	}

	@Override
	public String toString() {
		return "MiembroGCImpl [tip=" + tip + ", empleo=" + empleo + super.toString() + "]";
	}

		
}