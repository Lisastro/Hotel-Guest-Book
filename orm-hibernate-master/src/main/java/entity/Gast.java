package entity;

import jakarta.persistence.*;

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


    @Id
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    @Id
    public String getVoornaam() { return voornaam; }
    public void setVoornaam(String voornaam) { this.voornaam = voornaam; }

    @Id
    public String getAchternaam() { return achternaam; }
    public void setAchternaam(String achternaam) { this.achternaam = achternaam; }

    @Id
    public String getGeslacht() { return geslacht; }
    public void setGeslacht(String geslacht) { this.geslacht= geslacht; }

    public GastDetail getGastetailId() { return gastDetailId; }
    public void setGastDetailId(GastDetail gastDetailId) { this.gastDetailId = gastDetailId; }

}
