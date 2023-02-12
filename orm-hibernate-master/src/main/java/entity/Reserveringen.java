package entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

public class Reserveringen {
    @Id
    @GeneratedValue
    private Long id;
    private String naam;
}
