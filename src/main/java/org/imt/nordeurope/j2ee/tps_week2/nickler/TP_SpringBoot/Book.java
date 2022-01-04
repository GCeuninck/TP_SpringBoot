package org.imt.nordeurope.j2ee.tps_week2.nickler.TP_SpringBoot;

import java.time.LocalDate;

public class Book {

    private int id;
    private String name;
    private LocalDate parutionDate;

    public Book(int id, String name, LocalDate parutionDate) {
        super();
        this.name = name;
        this.id = id;
        this.parutionDate = parutionDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getParutionDate() {
        return parutionDate;
    }

    public void setParutionDate(LocalDate parutionDate) {
        this.parutionDate = parutionDate;
    }
}
