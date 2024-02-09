package lamdastest;

import junit.framework.Assert;
import junit.framework.TestCase;
import lamdas.FilterString;

import java.util.Arrays;
import java.util.List;

public class FilterStringTest extends TestCase {
    FilterString str = new FilterString();
    //true case
    public void testStrings(){
        List<String> givenlist = Arrays.asList("Arizona","Texas", "Allen");
        List<String> expectedListOutput = Arrays.asList("Arizona", "Allen");
        Assert.assertEquals(expectedListOutput,str.filterListStrings(givenlist,s -> s.startsWith("A")));
    }
    //false case
    public void testStrings2(){
        List<String> givenlist = Arrays.asList("Arizona","Texas", "Allen");
        List<String> expectedListOutput = Arrays.asList("Allen");
        Assert.assertNotSame(expectedListOutput,str.filterListStrings(givenlist,s -> s.startsWith("A")));
    }
    //null case
    public void testStrings3(){
        List<String> givenlist = Arrays.asList();
        List<String> expectedListOutput = Arrays.asList();
        Assert.assertEquals(expectedListOutput,str.filterListStrings(givenlist,s -> s.startsWith("A")));
    }
}
