package chapterEight.diaryProject;
import lombok.Data;

import java.util.ArrayList;
import java.util.Arrays;

@Data
public class Diary {
    private String name;
    private ArrayList<Entry> entries = new ArrayList<>();

    public Diary(String diaryName) {
        name = diaryName;
    }

    public void addNewEntry(String entryTitle, String entryBody) {
        Entry entry = new Entry();
        entry.setEntryTitle(entryTitle);
        entry.setEntryBody(entryBody);
        entries.add(entry);
    }

    public int getNumberOfEntries() {
        return entries.size();
    }

    @Override
    public String toString() {
        return String.format("""
                Diary name: %s
                entries: %s""", getName(), Arrays.toString(entries.toArray()));
    }

    public Entry findEntryByTitle(String searchKey) {
        for (Entry entry : entries){
            if (entry.getEntryTitle().equals(searchKey)){
                return entry;
            }
        }
        return null;
    }

    public void deleteEntryByTitle(String key) throws NoSuchFieldException {
        Entry entry = findEntryByTitle(key);
        if (entry == null){
            throw new NoSuchFieldException(String.format("%s does not exist", key));
        }
        getEntries().remove(entry);
    }

    public void addNewEntry(Entry entry) {
        getEntries().add(entry);
    }
}
