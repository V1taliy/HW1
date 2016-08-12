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
        Profile profile = new Profile(1, 'M', 500, "slave", false, true);
        User myUser = new User(profile);
        myUser.setName("Bitch");
        myUser.setVozrast(500);
        String rasa = myUser.setRasa("Ojaeby");
        String answer = "BigBitch";
        Assert.assertEquals(answer, "BigBitch");

        System.out.println("user = " + myUser.toString());


    }
}
