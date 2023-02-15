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


    public Gast createGast(Gast gast) {
        return repository.createGast(gast);
    }
    public List<Gast> readGast() { return repository.readGast(); }
    public Gast updateGast(Gast gast) { return repository.updateGast(gast); }
    public boolean deleteGast(long id) {return repository.deleteGast(id);}
}
