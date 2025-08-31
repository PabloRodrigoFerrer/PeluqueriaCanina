
package persistencia;

import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import logica.Mascota;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import logica.Duenio;
import persistencia.exceptions.NonexistentEntityException;

public class DuenioJpaController implements Serializable {

    public DuenioJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    
    public DuenioJpaController(){
        emf = Persistence.createEntityManagerFactory("peluqueriaCanina");
    }
    
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Duenio duenio) {
        if (duenio.getListaMascotas() == null) {
            duenio.setListaMascotas(new ArrayList<Mascota>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            List<Mascota> attachedListaMascotas = new ArrayList<Mascota>();
            for (Mascota listaMascotasMascotaToAttach : duenio.getListaMascotas()) {
                listaMascotasMascotaToAttach = em.getReference(listaMascotasMascotaToAttach.getClass(), listaMascotasMascotaToAttach.getNumCliente());
                attachedListaMascotas.add(listaMascotasMascotaToAttach);
            }
            duenio.setListaMascotas(attachedListaMascotas);
            em.persist(duenio);
            for (Mascota listaMascotasMascota : duenio.getListaMascotas()) {
                Duenio oldDuenioOfListaMascotasMascota = listaMascotasMascota.getDuenio();
                listaMascotasMascota.setDuenio(duenio);
                listaMascotasMascota = em.merge(listaMascotasMascota);
                if (oldDuenioOfListaMascotasMascota != null) {
                    oldDuenioOfListaMascotasMascota.getListaMascotas().remove(listaMascotasMascota);
                    oldDuenioOfListaMascotasMascota = em.merge(oldDuenioOfListaMascotasMascota);
                }
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Duenio duenio) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Duenio persistentDuenio = em.find(Duenio.class, duenio.getIdDuenio());
            List<Mascota> listaMascotasOld = persistentDuenio.getListaMascotas();
            List<Mascota> listaMascotasNew = duenio.getListaMascotas();
            List<Mascota> attachedListaMascotasNew = new ArrayList<Mascota>();
            for (Mascota listaMascotasNewMascotaToAttach : listaMascotasNew) {
                listaMascotasNewMascotaToAttach = em.getReference(listaMascotasNewMascotaToAttach.getClass(), listaMascotasNewMascotaToAttach.getNumCliente());
                attachedListaMascotasNew.add(listaMascotasNewMascotaToAttach);
            }
            listaMascotasNew = attachedListaMascotasNew;
            duenio.setListaMascotas(listaMascotasNew);
            duenio = em.merge(duenio);
            for (Mascota listaMascotasOldMascota : listaMascotasOld) {
                if (!listaMascotasNew.contains(listaMascotasOldMascota)) {
                    listaMascotasOldMascota.setDuenio(null);
                    listaMascotasOldMascota = em.merge(listaMascotasOldMascota);
                }
            }
            for (Mascota listaMascotasNewMascota : listaMascotasNew) {
                if (!listaMascotasOld.contains(listaMascotasNewMascota)) {
                    Duenio oldDuenioOfListaMascotasNewMascota = listaMascotasNewMascota.getDuenio();
                    listaMascotasNewMascota.setDuenio(duenio);
                    listaMascotasNewMascota = em.merge(listaMascotasNewMascota);
                    if (oldDuenioOfListaMascotasNewMascota != null && !oldDuenioOfListaMascotasNewMascota.equals(duenio)) {
                        oldDuenioOfListaMascotasNewMascota.getListaMascotas().remove(listaMascotasNewMascota);
                        oldDuenioOfListaMascotasNewMascota = em.merge(oldDuenioOfListaMascotasNewMascota);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = duenio.getIdDuenio();
                if (findDuenio(id) == null) {
                    throw new NonexistentEntityException("The duenio with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(int id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Duenio duenio;
            try {
                duenio = em.getReference(Duenio.class, id);
                duenio.getIdDuenio();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The duenio with id " + id + " no longer exists.", enfe);
            }
            List<Mascota> listaMascotas = duenio.getListaMascotas();
            for (Mascota listaMascotasMascota : listaMascotas) {
                listaMascotasMascota.setDuenio(null);
                listaMascotasMascota = em.merge(listaMascotasMascota);
            }
            em.remove(duenio);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Duenio> findDuenioEntities() {
        return findDuenioEntities(true, -1, -1);
    }

    public List<Duenio> findDuenioEntities(int maxResults, int firstResult) {
        return findDuenioEntities(false, maxResults, firstResult);
    }

    private List<Duenio> findDuenioEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Duenio.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Duenio findDuenio(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Duenio.class, id);
        } finally {
            em.close();
        }
    }

    public int getDuenioCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Duenio> rt = cq.from(Duenio.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
