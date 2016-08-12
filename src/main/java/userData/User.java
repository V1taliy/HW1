package userData;

import userProfile.Profile;

/**
 * Created by VitaliyS on 08/09/2016.
 */
public class User {

    private String username;
    private String password;

    private String name;
    private String rasa;
    private int vozrast;
    private Profile profile;

    public User() {
        this.name = "user1";
        this.rasa = "demon";
        this.vozrast = 0;
    }

    public User(Profile profile) {
        this.profile = profile;
    }

    public User(String name, String rasa, int vozrast) {
        this.name = name;
        this.rasa = rasa;
        this.vozrast = vozrast;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRasa() {
        return rasa;
    }

    public String setRasa(String rasa) {
        this.rasa = rasa;
        return rasa;
    }

    public int getVozrast() {
        return vozrast;
    }

    public void setVozrast(int vozrast) {
        this.vozrast = vozrast;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", rasa='" + rasa + '\'' +
                ", vozrast=" + vozrast +
                ", profile=" + profile +
                '}';
    }
}