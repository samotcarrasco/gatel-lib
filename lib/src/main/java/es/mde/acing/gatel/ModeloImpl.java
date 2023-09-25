package es.mde.acing.gatel;

import java.util.List;

public class ModeloImpl implements Modelo {
    private String marca;
    private String categoria;
    private String nombreModelo;
    private String detalles;
    private String imagen;
    
    //private List<Equipo> equipos;

    public static enum TipoModelo {
		EquipoInformatico,
	    WebCam,
	    Auriculares
	}
    
    @Override
    public String getMarca() {
        return marca;
    }

	public void setMarca(String marca) {
		this.marca = marca;
	}

    @Override
    public String getCategoria() {
        return categoria;
    }

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

    @Override
    public String getNombreModelo() {
        return nombreModelo;
    }

	public void setNombreModelo(String nombreModelo) {
		this.nombreModelo = nombreModelo;
	}

    @Override
    public String getDetalles() {
        return detalles;
    }

	public void setDetalles(String detalles) {
		this.detalles = detalles;
	}

    @Override
    public String getImagen() {
        return imagen;
    }

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	
 //   @Override
//    public List<Equipo> getEquipos() {
//        return equipos;
//    }
//    
//    public void setEquipos(List<Equipo> equipos) {
//		this.equipos = equipos;
//	}

	@Override
	public TipoModelo getTipoModelo() {
		//En las clases hijas(herecia) controlamos el valor del tipoModelo
		return null;
	}
	
	@Override
	public String toString() {
		return "ModeloImpl [marca=" + marca + ", categoria=" + categoria + ", nombreModelo=" + nombreModelo
				+ ", detalles=" + detalles ;//+ ", equipos=" + equipos + "]";
	}



	
}
