
package logica;

import java.util.List;
import persistencia.ControladoraPersistencia;
import persistencia.exceptions.NonexistentEntityException;

public class ControladoraServicios {
    
    ControladoraPersistencia controladoraPersistencia = new ControladoraPersistencia();
    
    // Servicios mascota
    
    public void crearMascota(String nombre, String raza, String color, String esAlergico, String attEspecial,String observaciones, Duenio duenio){
        
        Mascota mascota = new Mascota(
                nombre,
                raza,
                color,
                esAlergico,
                attEspecial,
                observaciones,
                duenio);
        
        controladoraPersistencia.crearMascota(mascota);
    }
    
     public List<Mascota> traerMascotas() {
        
         return controladoraPersistencia.traerMascotas();
    }
     
     public void eliminarMascota(int numCliente) throws NonexistentEntityException {
         
       controladoraPersistencia.eliminarMascota(numCliente);
    } 
    
    
    // Servicios Duenio
    
    public void crearDuenio(String nombre, String telefono){
        
        Duenio duenio = new Duenio();
        duenio.setNombre(nombre);
        duenio.setTelefono(telefono);
        
        controladoraPersistencia.crearDuenio(duenio);
    }
    
    public void crearDuenio(Duenio duenio){
        
        controladoraPersistencia.crearDuenio(duenio);
    }

   

   
}
