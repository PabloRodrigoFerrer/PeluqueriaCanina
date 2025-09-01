package logica;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import logica.Mascota;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2025-08-31T23:44:38", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Duenio.class)
public class Duenio_ { 

    public static volatile SingularAttribute<Duenio, String> telefono;
    public static volatile SingularAttribute<Duenio, String> nombre;
    public static volatile ListAttribute<Duenio, Mascota> listaMascotas;
    public static volatile SingularAttribute<Duenio, Integer> idDuenio;

}