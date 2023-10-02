package es.mde.acing.gatel;

import java.util.List;

public interface Unidad {

    String getNombre();
    
    String getCodigoUnidad();
    
    String getCorreoOficial();
    
    String getTelefono();
    
    List<EquipoDeUnidad> getEquiposDeUnidad();
    
    List<Persona> getMiembrosGC();
    
   // List<MiembroGC> getListaMiembrosGC();

}
