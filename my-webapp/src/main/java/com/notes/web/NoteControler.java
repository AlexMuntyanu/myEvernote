package com.notes.web;

import java.util.List;

import com.notes.entities.NoteImpl;
import com.notes.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 */
@Controller
public class NoteControler {
    private NoteService service;

    @Autowired
    public NoteControler(NoteService service) {
        this.service = service;
    }

    @RequestMapping(value ="/notes", method = RequestMethod.GET)
    public ModelAndView getNotesList(){
        final List<NoteImpl> notes = service.getNotes();
        ModelAndView mav = new ModelAndView("notes");
        mav.addObject("items", notes);
        return mav;
    }
}
