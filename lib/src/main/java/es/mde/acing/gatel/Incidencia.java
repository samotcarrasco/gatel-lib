package es.mde.acing.gatel;

import java.time.LocalDate;

import es.mde.acing.gatel.IncidenciaImpl.EstadoIncidencia;
import es.mde.acing.gatel.IncidenciaImpl.TipoIncidencia;

public interface Incidencia {

	String getCodigo();

	LocalDate getFechaAlta();

	LocalDate getFechaResolucion();
	
	EstadoIncidencia getEstado();
	
	String getDescripcion();

	Equipo getEquipo();

	Persona getAgenteResolutor();
	
	TipoIncidencia getTipoIncidencia();
}