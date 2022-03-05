package challange.content;

public class Course extends Content{

    private int duration;

    public Course(String title, String description, int duration) {
        super(title, description);
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return String.format("Course{title=%s, description=%s, duration=%s}", title, description, duration);
    }

    @Override
    public int getXP() {
        return DEFAULT_XP;
    }

    @Override
    public int calcXP() {
        return duration * DEFAULT_XP;
    }
}
