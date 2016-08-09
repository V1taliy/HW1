package HW1;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by VitaliyS on 08/09/2016.
 */
public class UserTest {
    @Test
    public void User(){
        User myUser = new User();
        myUser.name = "Bitch";
        myUser.color = "Black";
        String rasa = myUser.rasa;
String answer = "BigBitch";
        Assert.assertEquals(answer, "BigBitch");

         //System.out.println("Imya raba: " + myUser.name + " and " + "Cvet raba: " + myUser.color + ";" + " Rassa raba: " + myUser.rasa );
    }
}
