package com.epam.homeworks.JavaFundamentals.task6;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter

public class Notepad {
    public List<Note> notes = new ArrayList<>();
    private int price;
    private String nameOfStationery;

    public void addNote(Note note) {
        notes.add(note);
    }

    public Notepad() {
        price = 0;
    }

    public Notepad(String nameOfStationery, int price) {
        setNameOfStationery("Notepad");
        setPrice(price);
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Notepad notepad = (Notepad) o;

        if (price != notepad.price) return false;
        return notes != null ? notes.equals(notepad.notes) : notepad.notes == null;
    }

    @Override
    public int hashCode() {
        int result = notes != null ? notes.hashCode() : 0;
        result = 31 * result + price;
        return result;
    }

    @Override
    public String toString() {
        return "Notepad{" +
                "notes=" + notes +
                ", price=" + price +
                '}';
    }
}