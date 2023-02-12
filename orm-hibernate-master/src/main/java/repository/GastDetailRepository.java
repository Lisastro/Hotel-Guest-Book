package repository;

import entity.GastDetail;
import jakarta.persistence.EntityManager;

public class GastDetailRepository {

    private EntityManager entityManager;

    public GastDetailRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public GastDetail createGastDetail (GastDetail gastDetail) {
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(gastDetail);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return gastDetail;
    }
}
