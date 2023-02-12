package service;

import configuration.JPAConfiguration;
import entity.Gast;
import repository.GastRepository;

import java.util.List;

public class GastService {

    private final GastRepository repository;

    public GastService() {
        this.repository = new GastRepository(JPAConfiguration.getEntityManager());
    }

    public List<Gast> getGast() {
        return repository.getGast();
    }

    public Gast createGast(Gast gast) {
        return repository.createGast(gast);
    }
}
