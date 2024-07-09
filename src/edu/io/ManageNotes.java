package edu.io;

import java.util.ArrayList;
import java.util.Scanner;

public class ManageNotes extends IndexOutOfBoundsException {
    public void viewAllNotes(ArrayList<Note> notes){
        if (notes.isEmpty()) {
            System.out.println("No notes found!");
        } else {
            for (Note note : notes) {
                System.out.println("---");
                System.out.println("Note ID: " + note.getId());
                System.out.println("Title: " + note.getTitle());
                System.out.println("Content: " + note.getContent());
            }
        }
    }
    public void deleteNote(ArrayList<Note> notes) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the ID of the note to delete: ");
            int id = scanner.nextInt();
            int indexRemove = id - 1;
            notes.remove(indexRemove);
            System.out.println("Note with ID " + id + " deleted successfully!");

        } catch (IndexOutOfBoundsException e) {
            System.out.println("Note with ID ");
        }

    }
}
