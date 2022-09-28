import org.junit.Assert;
import org.junit.Test;

public class Testing {

    @Test
    public void helloWorldTest(){
        String expected= "Hello World";
        String actual= Message.print("Hello World");
        Assert.assertEquals(expected,actual);
    }

}
