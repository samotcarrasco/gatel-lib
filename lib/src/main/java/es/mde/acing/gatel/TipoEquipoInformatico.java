package es.mde.acing.gatel;

import java.util.List;

public class TipoEquipoInformatico {
	
	private int id;
	private String nombre;
	private List<EquipoInformatico> equipos;

	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public List<EquipoInformatico> getEquipos() {
		return equipos;
	}
	public void setEquipos(List<EquipoInformatico> equipos) {
		this.equipos = equipos;
	}
	@Override
	public String toString() {
		return "TipoEquipoInformatico [id=" + id + ", nombre=" + nombre + "]";
	}
	
}
