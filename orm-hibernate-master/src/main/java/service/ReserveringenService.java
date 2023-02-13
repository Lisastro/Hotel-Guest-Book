package service;

import configuration.JPAConfiguration;
import repository.ReserveringenRepository;

public class ReserveringenService {

    private ReserveringenRepository reserveringenService;

    public ReserveringenService () {
        this.reserveringenService = new ReserveringenRepository(JPAConfiguration.getEntityManager());
    }


}
