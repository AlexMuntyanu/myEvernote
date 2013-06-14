package com.notes.domain;

import java.sql.Date;

/**
 */
//@Entity
public class Note {
    private int pid;
    private String text;
    private Date dateOfCreation;
    private Date dateOfModification;

    public int getPid() {
        return pid;
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

    public void setPid(int pid) {
        this.pid = pid;
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
