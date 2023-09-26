package es.mde.acing.gatel;

import java.time.LocalDate;
import java.util.List;

public class EquipoImpl implements Equipo{

	private String numeroSerie;
	private LocalDate fechaAdquisicion;
	private LocalDate fechaAsignacion;
	Modelo modelo;
//	List<Unidad> unidades;
//	List<MiembroGC> miembrosGC;
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
	
//	@Override
//	public List<Unidad> getUnidades() {
//		return unidades;
//	}
//	
//	public void setUnidades(List<Unidad> unidades) {
//		this.unidades = unidades;
//	}
//
//	@Override
//	public List<MiembroGC> getMiembrosGC() {
//			return miembrosGC;
//	}
//	
//	public void setMiembrosGC(List<MiembroGC> miembrosGC) {
//		this.miembrosGC = miembrosGC;
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