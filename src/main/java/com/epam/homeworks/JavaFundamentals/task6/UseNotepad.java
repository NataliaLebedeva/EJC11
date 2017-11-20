package com.epam.homeworks.JavaFundamentals.task6;

public class UseNotepad {
    public static void main(String[] args) {
        Notepad np1 = new Notepad();
        Notepad.Note note1 = np1.new Note("title", "text-text-text");
        np1.addNote(note1);
        np1.viewAllNotes();

    }
}
