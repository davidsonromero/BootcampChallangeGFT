package challange.content;

public abstract class Content {
    protected String title;
    protected String description;
    
    protected static final int DEFAULT_XP = 10;

    public Content(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public abstract int getXP();

    public abstract int calcXP();
}