package HW1;

//import org.testng.Assert;
//import org.testng.annotations.Test;

import org.testng.Assert;
import org.testng.annotations.Test;
import userData.User;
import userProfile.Profile;

/**
 * Created by VitaliyS on 08/09/2016.
 */
public class UserTest {

    @Test(enabled = false)
    public void test() {
        User user = new User();
        User user2 = new User("Petya", "Russian", 99);
        System.out.println(user.toString());
        System.out.println(user2.toString());
        user.setRasa("elf");
        user.setVozrast(50);
        System.out.println(user.toString());
//        Assert.assertEquals(user.getVozrast(), 51);
    }

    @Test
    public void test1() {
        Profile profile = new Profile(53, 'M', 142, "slave", false, true);
        User myUser = new User(profile);
        myUser.setName("Bitch");
        myUser.setVozrast(32);
        String rasa = myUser.setRasa("Ojaeby");
        int answer = 142;
        Assert.assertEquals(answer, 142.64);

        System.out.println("user = " + myUser.toString());


    }

    @Test
    public void test2() {
        Profile profile = new Profile(167, 'F', 280, "Bysnes analisis", true, false);
        User myUser2 = new User(profile);
        myUser2.setName("Oleg");
        boolean hadPreviousJob = true;
        Assert.assertEquals(hadPreviousJob, true);
        System.out.println(myUser2.toString());
    }

    @Test
    public void test3() {
        Profile profile = new Profile(10, 'F', 300, "Web desinger", false, false);
        User myUser3 = new User(profile);
        myUser3.setName("Nikita");
        boolean agreesToTravelAbroad  = false;
        Assert.assertEquals(agreesToTravelAbroad , true);

        System.out.println(myUser3.toString());
    }
}