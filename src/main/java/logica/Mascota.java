
package logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Mascota implements Serializable {
    
    @Id
    @GeneratedValue( strategy = GenerationType.SEQUENCE)
    private int numCliente;
    private String nombre;
    private String raza;
    private String color;
    private String esAlergico;
    private String attEspecial;
    private String observaciones;
    
    @ManyToOne
    private Duenio duenio;

    public Mascota() {
    }

    public Mascota(String nombre, String raza, String color, String esAlergico, String attEspecial, String observaciones, Duenio duenio) {
        this.nombre = nombre;
        this.raza = raza;
        this.color = color;
        this.esAlergico = esAlergico;
        this.attEspecial = attEspecial;
        this.observaciones = observaciones;
        this.duenio = duenio;
    }

    public int getNumCliente() {
        return numCliente;
    }

    public void setNumCliente(int numCliente) {
        this.numCliente = numCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getEsAlergico() {
        return esAlergico;
    }

    public void setEsAlergico(String esAlergico) {
        this.esAlergico = esAlergico;
    }

    public String getAttEspecial() {
        return attEspecial;
    }

    public void setAttEspecial(String attEspecial) {
        this.attEspecial = attEspecial;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Duenio getDuenio() {
        return duenio;
    }

    public void setDuenio(Duenio duenio) {
        this.duenio = duenio;
    }



    

    
    
    
}
