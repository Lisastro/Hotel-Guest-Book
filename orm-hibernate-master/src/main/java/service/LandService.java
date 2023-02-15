package service;


import configuration.JPAConfiguration;
import entity.Land;
import repository.LandRepository;

public class LandService {

    private LandRepository landRepository;

    public LandService () { this.landRepository = new LandRepository(JPAConfiguration.getEntityManager()); }

    public Land createLand (Land land) {
        return LandRepository.createLand (land);
    }
}
