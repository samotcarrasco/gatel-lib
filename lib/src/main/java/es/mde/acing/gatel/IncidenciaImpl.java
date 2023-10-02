package es.mde.acing.gatel;

import java.time.LocalDate;


public class IncidenciaImpl implements Incidencia{

	private String codigo;
	private LocalDate fechaAlta;
	private LocalDate fechaResolucion;
	private EstadoIncidencia estado;
	private String descripcion;
	private Equipo equipo;
	private Persona agenteResolutor;

	public static enum TipoIncidencia {
			AVERIA,
		    EXTRAVIO,
		    CONFIGURACION,
		    SOLICITUD
	}
	public static enum EstadoIncidencia {
			NUEVA,
		    ASIGNADA,
		    RESUELTA,
		    CERRADA
		}
	
	@Override
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	@Override
	public LocalDate getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(LocalDate fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	@Override
	public LocalDate getFechaResolucion() {
		return fechaResolucion;
	}

	public void setFechaResolucion(LocalDate fechaResolucion) {
		this.fechaResolucion = fechaResolucion;
	}

	@Override
	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	@Override
	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public Equipo getEquipo() {
		return equipo;
	}

	public void setEquipo(Equipo equipo) {
		this.equipo = equipo;
	}

	@Override
	public Persona getAgenteResolutor() {
		return agenteResolutor;
	}

	public void setAgenteResolutor(Persona agenteResolutor) {
		this.agenteResolutor = agenteResolutor;
	}

	@Override
	public TipoIncidencia getTipoIncidencia() {
		//En las clases hijas(herecia) controlamos el valor del tipoModelo
		return null;
	}

	@Override
	public String toString() {
		return "IncidenciaImpl [codigo=" + codigo + ", fechaAlta=" + fechaAlta + ", fechaResolucion=" + fechaResolucion
				+ ", estado=" + estado + ", descripcion=" + descripcion + ", equipo=" + equipo + ", agenteResolutor="
				+ agenteResolutor + "]";
	}
	
}