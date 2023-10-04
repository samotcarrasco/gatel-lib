package es.mde.acing.gatel;

import java.util.List;

public interface MiembroGC {

    String getTip();
    
    String getEmpleo();
    
    Unidad getUnidad();
    
	List<EquipoPersonal> getEquiposPersonales();
  
}