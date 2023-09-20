package es.mde.acing.gatel;

import java.util.List;
import es.mde.acing.gatel.PersonaImpl.TipoPersona;
import es.mde.acing.gatel.PersonaImpl.Perfil;

public interface Persona {

    String getNombre();
    
    String getApellidos();
    
    String getTelefono();
    
    String getEmail();
    
    Perfil getPerfil();
    
    String getNombreUsuario();
    
    String getPassword();
    
    List<Incidencia> getIncidencias();
     
    TipoPersona getTipoPersona();
}