package es.mde.acing.gatel;

public class EquipoInformaticoImpl extends ModeloImpl implements EquipoInformatico {
  
	private Integer pulgadas;
	private Integer discoDuro;
	private Integer memoria;
	private String sistemaOperativo;
	private String tipoEquipoInformatico;
	
	@Override
	public Integer getPulgadas() {
		return pulgadas;
	}

	public void setPulgadas(Integer pulgadas) {
		this.pulgadas = pulgadas;
	}
	
	@Override
	public Integer getDiscoDuro() {
		return discoDuro;
	}
	
	public void setDiscoDuro(Integer discoDuro) {
		this.discoDuro = discoDuro;
	}
	
	@Override
	public Integer getMemoria() {
		return memoria;
	}
	
	public void setMemoria(Integer memoria) {
		this.memoria = memoria;
	}
	
	@Override
	public String getSistemaOperativo() {
		return sistemaOperativo;
	}
	
	public void setSistemaOperativo(String sistemaOperativo) {
		this.sistemaOperativo = sistemaOperativo;
	}
	
	@Override
	public String getTipoEquipoInformatico() {
		return tipoEquipoInformatico;
	}
	
	public void setTipoEquipoInformatico(String tipoEquipoInf) {
		this.tipoEquipoInformatico = tipoEquipoInf;
	}
	
	
	@Override
	public TipoModelo getTipoModelo() {
	    return TipoModelo.EquipoInformatico;
	}

	@Override
	public String toString() {
		return "EquipoInformaticoImpl [pulgadas=" + pulgadas + ", discoDuro=" + discoDuro + ", memoria=" + memoria
				+ ", sistemaOperativo=" + sistemaOperativo  + " Modelo " + super.toString() + "]";
	}
	

}