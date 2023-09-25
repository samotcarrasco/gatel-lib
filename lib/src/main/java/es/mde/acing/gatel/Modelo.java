package es.mde.acing.gatel;

import java.util.List;

import es.mde.acing.gatel.ModeloImpl.TipoModelo;


public interface Modelo {

	String getMarca();

	String getCategoria();
	
	String getNombreModelo();
	
	String getDetalles();
		
	String getImagen();
	
	TipoModelo getTipoModelo();
	
//	List<Equipo> getEquipos();

}