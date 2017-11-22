package com.epam.homeworks.JavaFundamentals.task6;

import java.util.ArrayList;
import java.util.List;

public class Notepad {
    public List<Note> notes = new ArrayList<>();

    public void addNote(Note note) {
        notes.add(note);
    }

    public void deleteNote(int i) throws Exception {
        if (notes.size() == 0) {
            throw new NullPointerException("no notes to delete");
        }
        if (i < 0 || i > notes.size()) {
            throw new IllegalArgumentException("no such note in notepad");
        }
        notes.remove(i);
    }

    public List<Note> getAllNotes() throws Exception {
        if (notes.size() == 0) {
            throw new NullPointerException("no notes in notepad");
        }
        return notes;
    }

    public void modifyNote(int i, Note note) throws Exception {
        if (notes.size() == 0) {
            throw new NullPointerException("no notes to change");
        }
        if (i < 0 || i > notes.size()) {
            throw new IllegalArgumentException("no such note in notepad");
        }
        notes.remove(i);
        notes.add(i, note);
    }

    public Note getNote(int i) throws Exception {
        if (notes.size() == 0) {
            throw new NullPointerException("no notes to change");
        }
        if (i < 0 || i > notes.size()) {
            throw new IllegalArgumentException("no such note in notepad");
        }
        return notes.get(i);
    }
}