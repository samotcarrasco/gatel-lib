package es.mde.acing.gatel;

import java.time.LocalDate;
import java.util.List;

import es.mde.acing.gatel.EquipoImpl.TipoEquipo;

public interface Equipo {

	String getNumeroSerie();

	LocalDate getFechaAdquisicion();

	LocalDate getFechaAsignacion();

	Modelo getModelo();
	
//	List<Unidad> getUnidades();
//
//	List<MiembroGC> getMiembrosGC();
	
	//List<Incidencia> getIncidencias();
	
	TipoEquipo getTipoEquipo();
	
}