import Oper.IMethod;
import Oper.Operation;
import org.junit.Assert;

public class MainTest {

    @org.junit.Test
    public void testGetNumber() {
        IMethod testOperation = new Operation();
        Assert.assertEquals(4, testOperation.testGetNumber());
    }
}