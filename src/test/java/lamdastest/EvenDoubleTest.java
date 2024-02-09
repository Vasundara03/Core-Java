package lamdastest;

import junit.framework.Assert;
import junit.framework.TestCase;
import lamdas.EvenDouble;
import java.util.List;
import java.util.Arrays;

public class EvenDoubleTest extends TestCase {
    EvenDouble even = new EvenDouble();
    //true case
    public void testevenDouble(){
        List<Integer> input = Arrays.asList(2,4,3);
        List<Double> expectedoutput = Arrays.asList(4.0,16.0);
        Assert.assertEquals(expectedoutput,even.evenDouble(input));
    }
    public void testevenDouble1(){
        List<Integer> input = Arrays.asList(1,3,5,7);
        List<Double> expectedoutput = Arrays.asList();
        Assert.assertEquals(expectedoutput,even.evenDouble(input));
    }
    //null case
    public void testevenDouble2(){
        List<Integer> input = Arrays.asList();
        List<Double> expectedoutput = Arrays.asList();
        Assert.assertEquals(expectedoutput,even.evenDouble(input));
    }
    //false case
    public void testevenDouble3() {
        List<Integer> input = Arrays.asList(1, 2, 4, 7);
        List<Double> expectedoutput = Arrays.asList(4.0);
        Assert.assertNotSame(expectedoutput, even.evenDouble(input));
    }
}
