package es.mde.acing.gatel;

import java.util.List;
import es.mde.acing.gatel.MiembroGCImpl.Empleo;

public interface MiembroGC {

    String getTip();
    
    Empleo getEmpleo();
    
    Unidad getUnidad();
    
	List<EquipoPersonal> getEquiposPersonales();
  
}