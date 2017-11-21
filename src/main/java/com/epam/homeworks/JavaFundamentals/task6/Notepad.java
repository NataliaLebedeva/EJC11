package com.epam.homeworks.JavaFundamentals.task6;

import java.util.ArrayList;
import java.util.List;

public class Notepad {
    public static List<String> allNotesInNotepad = new ArrayList<>();


    public void addNote(Note firstNote) {
        allNotesInNotepad.add(firstNote.title);
    }

    public void deleteNote(int i) {
        allNotesInNotepad.remove(i);
    }

    public List<String> getAllNotes() {
        return allNotesInNotepad;
    }

    public void modifyNote(Note note) {

    }
}
