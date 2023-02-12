package entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class GastDetail {

    @Id
    @GeneratedValue
    private Long id;
    private String geboorteDatum;
    private String adress;
    private String telefoonNummer;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGeboorteDatum() {
        return geboorteDatum;
    }

    public void setGeboorteDatum(String geboorteDatum) {
        this.geboorteDatum = geboorteDatum;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getTelefoonNummer() {
        return telefoonNummer;
    }

    public void setTelefoonNummer(String telefoonNummer) {
        this.telefoonNummer = telefoonNummer;
    }
}
