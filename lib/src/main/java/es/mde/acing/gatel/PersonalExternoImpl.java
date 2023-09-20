package es.mde.acing.gatel;

import java.util.List;

import es.mde.acing.gatel.PersonaImpl.TipoPersona;

public class PersonalExternoImpl extends PersonaImpl implements PersonalExterno {

    String dni;
    String empresa;
    	
    @Override
    public String getDni() {
		return dni;
	}
    
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	@Override
    public String getEmpresa() {
		return empresa;
	}
	
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	
	@Override
	public TipoPersona getTipoPersona() {
	    return TipoPersona.PersonalExterno;
	}

	@Override
	public String toString() {
		return "PersonalEXterno [dni=" + dni + ", empresa=" + empresa + " Persona: " + super.toString() + "]";
	}
	  
    
    
}