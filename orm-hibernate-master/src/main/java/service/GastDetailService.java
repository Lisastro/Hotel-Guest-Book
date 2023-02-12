package service;

import configuration.JPAConfiguration;
import entity.GastDetail;
import repository.GastDetailRepository;

public class GastDetailService {

    private GastDetailRepository gastDetailRepository;

    public GastDetailService() {
        this.gastDetailRepository = new GastDetailRepository(JPAConfiguration.getEntityManager());
    }

    public GastDetail createGastDetail(GastDetail gastDetail){
        return gastDetailRepository.createGastDetail(gastDetail);
    }
}
