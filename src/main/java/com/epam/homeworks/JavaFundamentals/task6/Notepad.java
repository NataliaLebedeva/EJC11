package com.epam.homeworks.JavaFundamentals.task6;

import java.util.ArrayList;
import java.util.List;

public class Notepad {
    private static List<String> allNotesInNotepad = new ArrayList<>();

    protected class Note{
        private String title;
        private String text;

        public Note(String title, String text) {
            this.title = title;
            this.text = text;
        }

    }

    public void addNote(Object note){
        allNotesInNotepad.add((String) note);
    }

    public void deleteNote(Object note) {
        allNotesInNotepad.remove(note);
    }

    public void changeNote(Object note) {

    }

    public void viewAllNotes() {
        for (String note : allNotesInNotepad) {
            System.out.println(note);

        }

    }

}
