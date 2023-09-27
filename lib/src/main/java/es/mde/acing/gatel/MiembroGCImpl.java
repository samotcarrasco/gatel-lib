package es.mde.acing.gatel;

import java.util.List;

public class MiembroGCImpl extends PersonaImpl implements MiembroGC {

	private String tip;
	private Empleo empleo;
    
    public static enum Empleo {
    	TenienteGeneral,
    	GeneralDeDivision,
    	GeneralDeBrigada,
        Coronel,
    	TenienteCoronel,
    	Comandante,
    	Capitan,
    	Teniente,
    	SuboficialMayor,
    	Subteniente,
    	Brigada,
    	SargentoPrimero,
    	Sargento,
    	CaboMayor,
    	CaboPrimero,
    	Cabo,
    	GuardiaCivil
	}	
	
    @Override
    public String getTip() {
		return tip;
	}
    
	public void setTip(String tip) {
		this.tip = tip;
	}
	
	@Override
    public Empleo getEmpleo() {
		return empleo;
	}
	
	public void setEmpleo(Empleo empleo) {
		this.empleo = empleo;
	}
	
	@Override
	public TipoPersona getTipoPersona() {
	    return TipoPersona.MiembroGC;
	}

	@Override
	public String toString() {
		return "MiembroGCImpl [tip=" + tip + ", empleo=" + empleo + super.toString() + "]";
	}

		
}