package es.mde.acing.gatel;

import java.time.LocalDate;

public interface Equipo {

	String getNumeroSerie();

	LocalDate getFechaAdquisicion();

	LocalDate getFechaAsignacion();

	Modelo getModelo();
	
//	List<Incidencial> getIncidencias();
	
}