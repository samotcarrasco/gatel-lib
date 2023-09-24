package es.mde.acing.gatel;


public class AuricularesImpl extends ModeloImpl implements Auriculares {
    private Boolean stereo;
    private String conexion;

    @Override
    public Boolean isStereo() {
        return stereo;
    }
    
    public void setStereo(Boolean stereo) {
		this.stereo = stereo;
	}

    @Override
    public String getConexion() {
        return conexion;
    }

	public void setConexion(String conexion) {
		this.conexion = conexion;
	}

    @Override
    public TipoModelo getTipoModelo() {
        return TipoModelo.Auriculares;
    }
    
    @Override
	public TipoEquipoInformatico getTipoEquipoInf() {
	 return null;
	}

	@Override
	public String toString() {
		return "AuricularesImpl [stereo=" + stereo + ", conexion=" + conexion + " Modelo " + super.toString() + "]";
	}
    
}