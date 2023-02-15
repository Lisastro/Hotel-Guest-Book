package entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Gast {

    @Id
    @GeneratedValue
    private Long id;
    private String voornaam;
    private String achternaam;
    private String geslacht;


    @OneToOne(cascade = CascadeType.ALL)
    private GastDetail gastDetailId;

    @ManyToOne(cascade = CascadeType.ALL)
    private Land landId;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Reserveringen> reserveringenId;



    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getVoornaam() {
        return voornaam;
    }
    public void setVoornaam(String voornaam) {
        this.voornaam = voornaam;
    }

    public String getAchternaam() {
        return achternaam;
    }
    public void setAchternaam(String achternaam) {
        this.achternaam = achternaam;
    }

    public String getGeslacht() {
        return geslacht;
    }
    public void setGeslacht(String geslacht) {
        this.geslacht = geslacht;
    }

    public GastDetail getGastDetailId() {
        return gastDetailId;
    }
    public void setGastDetailId(GastDetail gastDetailId) { this.gastDetailId = gastDetailId; }

    public Land getLand() {
        return landId;
    }
    public void setLand(Land landId) { this.landId= landId;}

    public List<Reserveringen> getReserveringenId() { return reserveringenId; }
    public void setReserveringenId(List<Reserveringen> reserveringenId) { this.reserveringenId = reserveringenId; }

}


