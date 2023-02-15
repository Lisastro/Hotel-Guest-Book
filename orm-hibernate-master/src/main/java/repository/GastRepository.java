package repository;

import entity.Gast;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

import java.util.List;


public class GastRepository {

    private EntityManager entityManager;

    public GastRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }



    public List<Gast> getGast() {
        String query = "select g from Gast g";
        TypedQuery<Gast> typedQuery = entityManager.createQuery(query, Gast.class);
        List<Gast> gastList = typedQuery.getResultList();
        return gastList;
    }

    public Gast createGast(Gast gast){
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(gast);
            entityManager.getTransaction().commit();
        }
        catch (Exception e) {
            e.printStackTrace();
            entityManager.getTransaction().rollback();
        }

        return gast;
    }

    public Gast updateGast(Gast gast) {
        try {
            entityManager.getTransaction().begin();
            entityManager.find(Gast.class, gast.getId());
            entityManager.merge(gast);
            entityManager.getTransaction().commit();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return gast;
    }

    public boolean deleteGast(long id) {
            try {
                entityManager.getTransaction().begin();
                Gast g = entityManager.find(Gast.class, id);
                entityManager.remove(g);
                entityManager.getTransaction().commit();
            } catch (Exception e) {
                e.printStackTrace();
                entityManager.getTransaction().rollback();
            }
            return false;
    }

    public List<Gast> readGast() {
            String query = "select g from Gast g";
            TypedQuery<Gast> typedQuery = entityManager.createQuery(query, Gast.class);
            List<Gast> g = typedQuery.getResultList();
            return g;
        }
    }

