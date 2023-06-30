import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Notepad {
    private Map<String, Note> notes;

    public Notepad() {
        notes = new TreeMap<>(); //не задан компаратор, если менять месяцы и годы в дате, то сортировка не работает
    }

    public void addNote(String date, String lastName) throws NoteAlreadyExistsException {
        if (notes.containsKey(date)) {
            throw new NoteAlreadyExistsException("Note already exists for this date.");
        }
        notes.put(date, new Note(lastName));
    }

    public Note getNote(String date) {
        return notes.get(date);
    }

    public List<Note> getAllNotes() {
        return new ArrayList<>(notes.values());
    }

    public class Note {
        private String lastName;

        public Note(String lastName) {
            this.lastName = lastName;
        }

        public String getLastName() {
            return lastName;
        }
    }
}