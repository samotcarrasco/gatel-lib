package es.mde.acing.gatel;

import java.util.List;


public interface Modelo {

	String getMarca();

	String getCategoria();
	
	String getNombreModelo();
	
	String getDetalles();
		
	List<Equipo> getEquipos();
	
	String getImagen();

}