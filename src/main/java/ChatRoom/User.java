package ChatRoom;

public class User {

    // User can either be a guest or a registered user
    private String username;
    private String password;
    private boolean isGuest;

    public User(String username, String password, boolean isGuest) {
        this.username = username;
        this.password = password;
        this.isGuest = isGuest;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public boolean isGuest() {
        return isGuest;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setGuest(boolean guest) {
        isGuest = guest;
    }

}
