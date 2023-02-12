package repository;

import entity.Land;
import jakarta.persistence.EntityManager;

public class LandRepository {

    private static EntityManager entityManager;

    public LandRepository (EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public static Land createLand(Land land) {
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(land);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return land;
    }
}
