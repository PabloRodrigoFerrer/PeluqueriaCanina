
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
    
    public void editarMascota(Mascota mascota,String nombre, String raza, String color, String esAlergico, String attEspecial, String observaciones) throws Exception {
     
         mascota.setNombre(nombre);
         mascota.setRaza(raza);
         mascota.setColor(color);
         mascota.setEsAlergico(esAlergico);
         mascota.setAttEspecial(attEspecial);
         mascota.setObservaciones(observaciones);
         
        controladoraPersistencia.editarMascota(mascota);
    }
    
    public void eliminarMascota(int numCliente) throws NonexistentEntityException {
         
       controladoraPersistencia.eliminarMascota(numCliente);
    }
    
    public List<Mascota> traerMascotas() {
        
         return controladoraPersistencia.traerMascotas();
    }
    
    public Mascota traerMascotaPorId(int _numCliente) {
    
        return controladoraPersistencia.traerMascotaPorId(_numCliente);
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

    public void editarDuenio(Duenio duenio, String nombre, String telefono) throws Exception {
        
        duenio.setNombre(nombre);
        duenio.setTelefono(telefono);
        
        controladoraPersistencia.editarDuenio(duenio);
    }

    

   

   

   
}
