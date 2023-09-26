package es.mde.acing.gatel;

import java.time.LocalDate;
import java.util.List;

public class EquipoImpl implements Equipo{

	String numeroSerie;
	LocalDate fechaAdquisicion;
	LocalDate fechaAsignacion;
	Modelo modelo;
	//List<Incidencia> incidencias;
	
	public static enum TipoEquipo {
			EquipoDeUnidad,
		    EquipoPersonal
		}
	
	@Override
	public String getNumeroSerie() {
		return numeroSerie;
	}
	
	public void setNumeroSerie(String numeroSerie) {
		this.numeroSerie = numeroSerie;
	}
	
	@Override
	public LocalDate getFechaAdquisicion() {
		return fechaAdquisicion;
	}
	
	public void setFechaAdquisicion(LocalDate fechaAdquisicion) {
		this.fechaAdquisicion = fechaAdquisicion;
	}
	
	@Override
	public LocalDate getFechaAsignacion() {
		return fechaAsignacion;
	}
	
	public void setFechaAsignacion(LocalDate fechaAsignacion) {
		this.fechaAsignacion = fechaAsignacion;
	}
	
	@Override
	public Modelo getModelo() {
		return modelo;
	}
	
	public void setModelo(Modelo modelo) {
		this.modelo = modelo;
	}
	
//	@Override
//	public List<Incidencia> getIncidencias() {
//		return incidencias;
//	}
//	
//	public void setIncidencias(List<Incidencia> incidencias) {
//		this.incidencias = incidencias;
//	}
	
	@Override
	public TipoEquipo getTipoEquipo() {
		//En las clases hijas(herecia) controlamos el valor del tipoModelo
		return null;
	}
	
	@Override
	public String toString() {
		return "EquipoImpl [numeroSerie=" + numeroSerie + ", fechaAdquisicion=" + fechaAdquisicion
				+ ", fechaAsignacion=" + fechaAsignacion + ", modelo=" + modelo ; //+ ", incidencias=" + incidencias + "]";
	}
	
}