package com.notes.service.impl;

import java.util.List;

import com.notes.entities.NoteImpl;
import com.notes.entities.Test;
import com.notes.service.NoteService;

/**
 */
public class NoteServiceImpl implements NoteService{
    private Test note;

    public NoteServiceImpl(Test note) {
        this.note = note;
    }

    @Override
    public List<NoteImpl> getNotes() {
        try {
            return note.getNoteList();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
