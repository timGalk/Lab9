package edu.io;

import java.util.ArrayList;

public class ManageNotes {
    public void viewAllNotes(ArrayList<Note> notes){
        if (notes.isEmpty()) {
            System.out.println("No notes found!");
        } else {
            for (Note note : notes) {
                System.out.println("---");
                System.out.println("Note Id" + note.getId());
                System.out.println("Title: " + note.getTitle());
                System.out.println("Content: " + note.getContent());
            }
        }
    }
}
