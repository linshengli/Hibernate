package entities;

import java.util.Set;

/**
 * Created by tbxsx on 17-5-26.
 */
public class User {
    private long id;
    private String username;
    private String email;
    private Set<String> phoneSet;
    private Set<Address> addressSet;

    public User() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Set<String> getPhoneSet() {
        return phoneSet;
    }

    public void setPhoneSet(Set<String> phoneSet) {
        this.phoneSet = phoneSet;
    }

    public Set<Address> getAddressSet() {
        return addressSet;
    }

    public void setAddressSet(Set<Address> addressSet) {
        this.addressSet = addressSet;
    }
}
