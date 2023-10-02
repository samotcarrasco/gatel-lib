package es.mde.acing.gatel;

public class PersonalExternoImpl extends PersonaImpl implements PersonalExterno {

	private String dni;
	private String empresa;
    	
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
	    return TipoPersona.PERSONAL_EXTERNO;
	}

	@Override
	public String toString() {
		return "PersonalEXterno [dni=" + dni + ", empresa=" + empresa + " Persona: " + super.toString() + "]";
	}
	  
    
    
}