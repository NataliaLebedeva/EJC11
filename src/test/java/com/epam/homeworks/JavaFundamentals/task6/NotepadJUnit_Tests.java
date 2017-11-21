package com.epam.homeworks.JavaFundamentals.task6;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

public class NotepadJUnit_Tests {
    private Notepad notepad;

    @BeforeTest
    public void setup() {
        notepad = new Notepad();
    }

    @Test
    void testAddNote() throws Exception {
        if (Notepad.allNotesInNotepad.isEmpty()) {
            Note firstNote = new Note("title", "text");
            notepad.addNote(firstNote);
            Assert.assertEquals(Notepad.allNotesInNotepad.size(), 1);
            Assert.assertEquals(Notepad.allNotesInNotepad.get(0), "title");
        } else throw new Exception("cannot be added as a first note");
    }

    @Test
    void testDeleteNote() throws Exception {
        int index = 0;
        if ( !Notepad.allNotesInNotepad.isEmpty()
                && index < Notepad.allNotesInNotepad.size()) {
            notepad.deleteNote(index);
        } else throw new Exception("no such element");
    }

    @Test
    void testModifyNote() throws Exception {
        int index = 0;
        Note firstNote = new Note("title", "text");
        notepad.addNote(firstNote);
        if ( !Notepad.allNotesInNotepad.isEmpty()
                && index < Notepad.allNotesInNotepad.size()) {
            notepad.modifyNote(index, "title_2", "text changed");
        } else throw new Exception("no such element");
    }

    @Test
    void testGetListOfNotes() throws Exception {
        Note firstNote = new Note("title", "text");
        notepad.addNote(firstNote);
        if ( !Notepad.allNotesInNotepad.isEmpty()) {
        notepad.getAllNotes();
        } else throw new Exception("No notes found, the notepad is empty");


    }
}