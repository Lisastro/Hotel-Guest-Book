package entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;


@Entity
public class Reserveringen {
    @Id
    @GeneratedValue
    private Long id;
    private String reservering_nummer;
    private String check_in;
    private String check_out;
    private String aantal_kamers;
    private String aantal_personen;


    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getReservering_nummer() { return reservering_nummer; }
    public void setReservering_nummer(String reservering_nummer) { this.reservering_nummer = reservering_nummer; }

    public String getCheck_in() { return check_in; }
    public void setCheck_in(String check_in) { this.check_in = check_in; }

    public String getCheck_out() { return check_out; }
    public void setCheck_out(String check_out) { this.check_out = check_out; }

    public String getAantal_kamers() { return aantal_kamers; }
    public void setAantal_kamers(String aantal_kamers) { this.aantal_kamers = aantal_kamers; }

    public String getAantal_personen() { return aantal_personen; }
    public void setAantal_personen(String aantal_personen) { this.aantal_personen = aantal_personen; }



}
