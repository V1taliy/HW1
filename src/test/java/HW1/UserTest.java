package HW1;

//import org.testng.Assert;
//import org.testng.annotations.Test;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by VitaliyS on 08/09/2016.
 */
public class UserTest {

    @Test
   public void test() {
        User user = new User();
        User user2 = new User("Petya", "Russian", 99);
        System.out.println(user.toString());
        System.out.println(user2.toString());
        user.setRasa("elf");
        user.setVozrast(50);
        System.out.println(user.toString());
        Assert.assertEquals(user.getVozrast(), 51);
   }

//    @Test
//    public User(){
//        User myUser = new User();
//        myUser.name = "Bitch";
//        myUser.vozrast = 30;
//        String rasa = myUser.rasa;
//String answer = "BigBitch";
//        Assert.assertEquals(answer, "BigBitch");
//
//         System.out.println("Imya raba: " + myUser.name + " and " + "Vozrast raba : " + myUser.vozrast + ";" + " Rassa raba: " + myUser.rasa );
//    }
}
