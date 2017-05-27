package entities;

/**
 * Created by tbxsx on 17-5-27.
 */
public class Phone {
    private long id;
    private User user;
    private String phone;

    public Phone() {
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
