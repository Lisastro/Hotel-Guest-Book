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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getReservering_nummer() {
        return reservering_nummer;
    }

    public void setReservering_nummer(String reservering_nummer) {
        this.reservering_nummer = reservering_nummer;
    }
}
