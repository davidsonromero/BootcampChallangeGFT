package challange.content;

import java.time.LocalDate;

public class Mentorship extends Content{
    private LocalDate date;
    
    public Mentorship(String title, String description, LocalDate date) {
        super(title, description);
        this.date = date;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return String.format("Mentorship{title=%s, description=%s, date=%s}", title, description, date);
    }

    @Override
    public int getXP() {
        return DEFAULT_XP;
    }

    @Override
    public int calcXP() {
        return DEFAULT_XP;
    }
}
