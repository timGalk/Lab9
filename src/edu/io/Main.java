package edu.io;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //example
        ArrayList<Note> notes= new ArrayList<>();
        notes.add(new Note(1, "Note 1", "This is the content of the first note"));
        notes.add(new Note(2, "Note 2", "This is the content of the second note"));
        notes.add(new Note(3, "Note 3", "This is the content of the third note"));
    }
}
