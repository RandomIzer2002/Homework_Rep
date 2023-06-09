import java.util.List;

public class DZ13Task2 {
    public static void main(String[] args) {
        Notepad notepad = new Notepad();
        try {
            notepad.addNote("01-01-2022", "Smith");
            notepad.addNote("02-01-2022", "Johnson");
            notepad.addNote("03-01-2022", "Brown");
            notepad.addNote("02-01-2022", "Davis"); // This will throw NoteAlreadyExistsException
        } catch (NoteAlreadyExistsException e) {
            System.out.println("Error: " + e.getMessage());
        }

        List<Notepad.Note> allNotes = notepad.getAllNotes();
        for (Notepad.Note note : allNotes) {
            System.out.println(note.getLastName());
        }
    }
}