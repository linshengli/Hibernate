package entities;

import java.util.Set;

/**
 * Created by tbxsx on 17-5-27.
 */
public class Address {
    private long id;
    private String name;
    private Set<User> userSet;

    public Address() {
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

    public Set<User> getUserSet() {
        return userSet;
    }

    public void setUserSet(Set<User> userSet) {
        this.userSet = userSet;
    }
}
