
package logica;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Duenio implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int idDuenio;
    private String nombre;
    private String telefono;
    
    @OneToMany( mappedBy = "duenio")
    private List<Mascota> listaMascotas;

    public Duenio() {
    }

    public Duenio(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public Duenio(String nombre, String telefono, List<Mascota> listaMascotas) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.listaMascotas = listaMascotas;
    }

    public int getIdDuenio() {
        return idDuenio;
    }

    public void setIdDuenio(int idDuenio) {
        this.idDuenio = idDuenio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public List<Mascota> getListaMascotas() {
        return listaMascotas;
    }

    public void setListaMascotas(List<Mascota> listaMascotas) {
        this.listaMascotas = listaMascotas;
    }
    
    
    
    
}
