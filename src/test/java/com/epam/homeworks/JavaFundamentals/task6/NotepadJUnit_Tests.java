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
    void testAddNote() {
        Assert.assertTrue(Notepad.allNotesInNotepad.isEmpty());
        Note firstNote = new Note("title", "text");
        notepad.addNote(firstNote);
        Assert.assertEquals(Notepad.allNotesInNotepad.size(), 1);
        Assert.assertEquals(firstNote.getTitle(), "title");
        Assert.assertEquals(firstNote.getText(), "text");

    }

    @Test
    void testDeleteNote() {
        int index = 0;
        Note note1 = new Note("title", "text");
        notepad.addNote(note1);

        Assert.assertFalse(Notepad.allNotesInNotepad.isEmpty()); //should be not empty
        notepad.deleteNote(index);
        Assert.assertTrue(Notepad.allNotesInNotepad.isEmpty()); //should be empty
    }

    @Test
    void testModifyNote() throws Exception {
        int index = 0;
        Note firstNote = new Note("title", "text");
        Note changedNote = new Note("titleChanged", "New text");
        notepad.addNote(firstNote);
        notepad.modifyNote(changedNote);
        int before = Notepad.allNotesInNotepad.size();
        Assert.assertEquals(firstNote.getText(), changedNote.getText());
        Assert.assertEquals(firstNote.getTitle(), changedNote.getTitle());
        Assert.assertEquals(before, Notepad.allNotesInNotepad.size());
    }

    @Test
    void testGetListOfNotes() throws Exception {
        Note firstNote = new Note("title", "text");
        notepad.addNote(firstNote);
        if (!Notepad.allNotesInNotepad.isEmpty()) {
            notepad.getAllNotes();
        } else throw new Exception("No notes found, the notepad is empty");


    }
}