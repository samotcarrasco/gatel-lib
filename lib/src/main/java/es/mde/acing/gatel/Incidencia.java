package es.mde.acing.gatel;

import java.time.LocalDate;
import es.mde.acing.gatel.IncidenciaImpl.TipoIncidencia;

public interface Incidencia {

	String getCodigo();

	LocalDate getFechaAlta();

	LocalDate getFechaResolucion();
	
	String getEstado();
	
	String getDescripcion();

	Equipo getEquipo();

	Persona getAgenteResulutor();
	
	TipoIncidencia getTipoIncidencia();
}