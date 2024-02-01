package functionalinterfacetest;

import functionalinterface.Factorial;
import junit.framework.Assert;
import junit.framework.TestCase;

public class FactorialTest extends TestCase {

    //true case
    public void testFactor(){
        Factorial f = new Factorial();
        Assert.assertEquals(6,f.factorialNum(3));
    }
    //false case
    public void testFactor2(){
        Factorial f = new Factorial();
        Assert.assertNotSame(23,f.factorialNum(5));
    }
    //zero case
    public void testFactor3(){
        Factorial f = new Factorial();
        Assert.assertEquals(1,f.factorialNum(0));
    }

}
