package entities;

/**
 * Created by tbxsx on 17-5-28.
 */
public class Husband {
    private long id;
    private String name;
    private Wife wife;

    public Husband() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Wife getWife() {
        return wife;
    }

    public void setWife(Wife wife) {
        this.wife = wife;
    }
}
