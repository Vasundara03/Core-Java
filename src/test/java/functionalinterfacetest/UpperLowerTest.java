package functionalinterfacetest;

import functionalinterface.UpperLowerCase;
import junit.framework.Assert;
import junit.framework.TestCase;

public class UpperLowerTest extends TestCase {
    public void testUpperLower(){
        //true case
        Assert.assertEquals("TeXaS", UpperLowerCase.convertCase("tExAs"));
        Assert.assertEquals("TEXAS", UpperLowerCase.convertCase("texas"));
        Assert.assertEquals("texas", UpperLowerCase.convertCase("TEXAS"));

        //false case
        Assert.assertNotSame("Texas", UpperLowerCase.convertCase("TEXAS"));

        //null case
        Assert.assertEquals(null, UpperLowerCase.convertCase(null));
        Assert.assertEquals(" ", UpperLowerCase.convertCase(" "));
      }
}
