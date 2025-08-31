
package persistencia;

import java.util.List;
import logica.Duenio;
import logica.Mascota;
import persistencia.exceptions.NonexistentEntityException;


public class ControladoraPersistencia {
    
    MascotaJpaController mascotaJpa =  new MascotaJpaController();
    DuenioJpaController duenioJpa = new DuenioJpaController();
    
    // Mascota controladores

    public void crearMascota(Mascota mascota) {
        mascotaJpa.create(mascota);
    }
    
    public void editarMascota(Mascota mascota) throws Exception {
        
        mascotaJpa.edit(mascota);
    }
    
    
    public void eliminarMascota(int numCliente) throws NonexistentEntityException {
       
        mascotaJpa.destroy(numCliente);
    }
    
    public List<Mascota> traerMascotas() {
    
        return mascotaJpa.findMascotaEntities();
    }
    
    public Mascota traerMascotaPorId(int _numCliente) {
        
        return mascotaJpa.findMascota(_numCliente);
    }
    
  
      
    
    
    // Dueño controladores
    
    public void crearDuenio(Duenio duenio) {
        
        duenioJpa.create(duenio);
    }

    public void editarDuenio(Duenio duenio) throws Exception {
      
        duenioJpa.edit(duenio);
    }

  

  

  

    
    
    
    
}
