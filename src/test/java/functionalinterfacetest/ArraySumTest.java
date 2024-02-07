package functionalinterfacetest;

import functionalinterface.ArraySum;
import junit.framework.Assert;
import junit.framework.TestCase;

public class ArraySumTest extends TestCase {
    ArraySum a = new ArraySum();
    //true case
    public void testArray(){
        int[] arr={1,2,3,4,5};
        Assert.assertEquals(15,a.arraySum(arr));
    }
    //contains zero
    public void testArray1(){
        int[] arr={};
        Assert.assertEquals(0,a.arraySum(arr));
    }
    public void testArrayn(){
        int[] arr=null;
        Assert.assertEquals(0,a.arraySum(arr));
    }
    //false case
    public void testArray2(){
        int[] arr={1,2,3,0,5};
        Assert.assertNotSame(10,a.arraySum(arr));
    }


}
