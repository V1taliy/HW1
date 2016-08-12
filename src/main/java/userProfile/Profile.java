package userProfile;

import userData.User;

/**
 * Created by VitaliyS on 08/12/2016.
 */
public class Profile {
    private int numberOfFriends;
    private char maleOrFemale;
    private int avarageSalaryForLastYear;
    private String position;
    private boolean hadPreviousJob;
    private boolean agreesToTravelAbroad = hadPreviousJob;

    public Profile() {
    }

    public Profile(User user) {

    }

    public Profile(Profile profile) {
        this.position = profile.position;
    }

    public Profile(int numberOfFriends, char maleOrFemale,
                   int avarageSalaryForLastYear, String position,
                   boolean hadPreviousJob, boolean agreesToTravelAbroad) {
        this.numberOfFriends = numberOfFriends;
        this.maleOrFemale = maleOrFemale;
        this.avarageSalaryForLastYear = avarageSalaryForLastYear;
        this.position = position;
        this.hadPreviousJob = hadPreviousJob;
        this.agreesToTravelAbroad = agreesToTravelAbroad;
    }

    @Override
    public String toString() {
        return "Profile{" +
                "numberOfFriends=" + numberOfFriends +
                ", maleOrFemale=" + maleOrFemale +
                ", avarageSalaryForLastYear=" + avarageSalaryForLastYear +
                ", position='" + position + '\'' +
                ", hadPreviousJob=" + hadPreviousJob +
                ", agreesToTravelAbroad=" + agreesToTravelAbroad +
                '}';
    }
}
