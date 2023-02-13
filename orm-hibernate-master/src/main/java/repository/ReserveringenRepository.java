package repository;

import entity.Reserveringen;
import jakarta.persistence.EntityManager;

public class ReserveringenRepository {

    private static EntityManager entityManager;

    public ReserveringenRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public static Reserveringen createReserveringen(Reserveringen reserveringen) {
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(reserveringen);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return reserveringen;

    }
}
