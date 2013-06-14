package com.notes.service;

import java.util.List;

import com.notes.entities.NoteImpl;

/**
 */
public interface NoteService {
    List<NoteImpl> getNotes();
}
