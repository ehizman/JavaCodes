package chapterEight.diaryProject;

import lombok.Data;

import java.security.InvalidParameterException;
import java.time.LocalDateTime;


public class Entry {
    private String entryTitle;
    private String entryBody;
    LocalDateTime entryDateTime;

    public Entry(String entryTitle, String entryBody) {
        this.entryTitle = entryTitle;
        this.entryBody = entryBody;
        entryDateTime = LocalDateTime.now();
    }

    public Entry() {
        this.entryBody = null;
        this.entryTitle = null;
        this.entryDateTime = LocalDateTime.now();
    }
    public String getEntryTitle() {
        return entryTitle;
    }

    public void setEntryTitle(String entryTitle) {
        try{
            validation(entryTitle);
            this.entryTitle = entryTitle;
        }
        catch (InvalidParameterException error){
            System.out.println(error.getMessage());
        }
    }

    public String getEntryBody() {
        return entryBody;
    }

    public void setEntryBody(String entryBody) {
        try{
            validation(entryBody);
            this.entryBody = entryBody;
        }
        catch (InvalidParameterException error){
            System.out.println(error.getMessage());
        }
    }

    private void validation(String parameterToValidate) {
        if (parameterToValidate.equals(null)){
            throw new InvalidParameterException("body of entry not entered");
        }
    }

    public LocalDateTime getEntryDateTime() {
        return entryDateTime;
    }

    @Override
    public String toString() {
        return  String.format("""
        Entry title: %s
        Entry Body: %s""", getEntryTitle(), getEntryBody());
    }
}
