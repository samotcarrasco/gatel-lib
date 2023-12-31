package es.mde.acing.gatel;

import java.util.List;

import es.mde.acing.gatel.PersonaImpl.Perfil;
import es.mde.acing.gatel.PersonaImpl.TipoPersona;

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
    
    List<EquipoPersonal> getEquiposPersonales();
    
    Unidad getUnidad();
}