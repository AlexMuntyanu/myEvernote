package com.notes.entities;

import java.sql.Date;

/**
 */
@Entity
public class Note {
    private int id;
    private String text;
    private Date dateOfCreation;
    private Date dateOfModification;

    public int getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public Date getDateOfCreation() {
        return dateOfCreation;
    }

    public Date getDateOfModification() {
        return dateOfModification;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setDateOfCreation(Date dateOfCreation) {
        this.dateOfCreation = dateOfCreation;
    }

    public void setDateOfModification(Date dateOfModification) {
        this.dateOfModification = dateOfModification;
    }
}
