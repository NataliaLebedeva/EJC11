package com.epam.homeworks.JavaFundamentals.task6;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.List;

public class NotepadTestNG {
    private Notepad notepad;

    @BeforeMethod
    public void setup() {
        notepad = new Notepad("notepad", 3);
    }

    @DataProvider
    public Object[] noteNegativeTestMap() {
        return new Object[]{
                -1, null, 10
        };
    }

    @Test
    void testAddNote() throws Exception {
        Assert.assertTrue(notepad.notes.isEmpty());
        Note note = new Note("title", "text");
        notepad.addNote(note);
        Assert.assertEquals(notepad.notes.size(), 1);
        Assert.assertEquals(notepad.getNote(0).getTitle(), note.getTitle());
        Assert.assertEquals(notepad.getNote(0).getText(), note.getText());
    }

    @Test
    void testDeleteSingleNote() throws Exception {
        int index = 0;
        Note note1 = new Note("title", "text");
        notepad.addNote(note1);

        Assert.assertFalse(notepad.notes.isEmpty()); //should be not empty
        notepad.deleteNote(index);
        Assert.assertTrue(notepad.notes.isEmpty()); //should be empty
    }

    @Test
    void testModifyNote() throws Exception {
        Note firstNote = new Note("title", "text");
        Note note1 = new Note("title", "text");
        Note note2 = new Note("title", "text");
        notepad.addNote(firstNote);
        notepad.addNote(note1);
        notepad.addNote(note2);
        Note changedNote = new Note("titleChanged", "New text");
        int before = notepad.notes.size();

        notepad.modifyNote(0, changedNote);
        Assert.assertEquals(notepad.getNote(0).getText(), changedNote.getText());
        Assert.assertEquals(notepad.getNote(0).getTitle(), changedNote.getTitle());
        Assert.assertEquals(notepad.getNote(1).getText(), note1.getText());
        Assert.assertEquals(notepad.getNote(1).getTitle(), note1.getTitle());
        Assert.assertEquals(notepad.getNote(2).getText(), note2.getText());
        Assert.assertEquals(notepad.getNote(2).getTitle(), note2.getTitle());
        Assert.assertEquals(before, notepad.notes.size());
    }

    @Test
    void testGetListOfNotes() throws Exception {
        Note firstNote = new Note("title", "text");
        Note note1 = new Note("title", "text");
        Note note2 = new Note("title", "text");
        notepad.addNote(firstNote);
        notepad.addNote(note1);
        notepad.addNote(note2);
        List<Note> notes = notepad.getAllNotes();

        Assert.assertEquals(notepad.notes.size(), 3);
        Assert.assertEquals(notes.get(0).getText(), firstNote.getText());
        Assert.assertEquals(notes.get(0).getTitle(), firstNote.getTitle());
        Assert.assertEquals(notes.get(1).getText(), note1.getText());
        Assert.assertEquals(notes.get(1).getTitle(), note1.getTitle());
        Assert.assertEquals(notes.get(2).getText(), note2.getText());
        Assert.assertEquals(notes.get(2).getTitle(), note2.getTitle());
    }

    @Test
    void testDeleteNote() throws Exception {
        Note firstNote = new Note("title", "text");
        Note note1 = new Note("title", "text");
        Note note2 = new Note("title", "text");
        notepad.addNote(firstNote);
        notepad.addNote(note1);
        notepad.addNote(note2);
        int before = notepad.notes.size();

        Assert.assertFalse(notepad.notes.isEmpty()); //should be not empty
        notepad.deleteNote(1);
        Assert.assertEquals(notepad.notes.size(), before - 1);
        Assert.assertEquals(notepad.getNote(0).getText(), firstNote.getText());
        Assert.assertEquals(notepad.getNote(0).getTitle(), firstNote.getTitle());
        Assert.assertEquals(notepad.getNote(1).getText(), note2.getText());
        Assert.assertEquals(notepad.getNote(1).getTitle(), note2.getTitle());
    }

    @Test (expectedExceptions = {IllegalArgumentException.class, NullPointerException.class},
    dataProvider = "noteNegativeTestMap")
    void testNegativeDeleteNote(Integer index) throws Exception {
        Note firstNote = new Note("title", "text");
        Note note1 = new Note("title", "text");
        Note note2 = new Note("title", "text");
        notepad.addNote(firstNote);
        notepad.addNote(note1);
        notepad.addNote(note2);

        Assert.assertFalse(notepad.notes.isEmpty()); //should be not empty
        notepad.deleteNote(index);
    }

    @Test (expectedExceptions = {IllegalArgumentException.class, NullPointerException.class},
            dataProvider = "noteNegativeTestMap")
    void testNegativeDeleteFromEmpty(Integer i) throws Exception {
        notepad.deleteNote(i);
    }

    @Test (expectedExceptions = {IllegalArgumentException.class, NullPointerException.class},
            dataProvider = "noteNegativeTestMap")
    void testNegativeModifyNote(Integer i) throws Exception {
        Note firstNote = new Note("title", "text");
        Note note1 = new Note("title", "text");
        Note note2 = new Note("title", "text");
        notepad.addNote(firstNote);
        notepad.addNote(note1);
        notepad.addNote(note2);
        Note changedNote = new Note("titleChanged", "New text");

        notepad.modifyNote(i, changedNote);
    }

}