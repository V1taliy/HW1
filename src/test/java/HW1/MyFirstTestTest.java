package HW1;


import com.sun.org.apache.xpath.internal.SourceTree;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyFirstTestTest

{

    @Test
    public void canAddTwoPlusTwo() {
        int answer = 2 + 2;
        Assert.assertEquals(answer, 4);


    }

    @Test
    public void canAddTwoChars() {
        char result = 'a';

        Assert.assertEquals(result, 'a' + 'b' + 'c');
    }



    }
