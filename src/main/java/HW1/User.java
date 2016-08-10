package HW1;

/**
 * Created by VitaliyS on 08/09/2016.
 */
public class User {

    private String name;
    private String rasa;
    private int vozrast;

    public User() {
        this.name = "user1";
        this.rasa = "demon";
        this.vozrast = 0;
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

    public void setRasa(String rasa) {
        this.rasa = rasa;
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
                "name='" + name + '\'' +
                ", rasa='" + rasa + '\'' +
                ", vozrast=" + vozrast +
                '}';
    }

}