package special;

import Oper.IMethod;
import Oper.Operation;
import org.junit.Assert;

public class SpecialTest {

    @org.junit.Test
    public void testGetNumber() {
        IMethod testOperation = new Operation();
        Assert.assertEquals(4, testOperation.testGetNumber());
    }
}
