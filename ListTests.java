import static org.junit.Assert.*;
import java.util.*;
import org.junit.*;

public class ListTests {
    private List<String> listOfStrings;

    @Before
    public void setUp() throws Exception{
        listOfStrings = new ArrayList<String>();
    }

    private void populateList(){
        listOfStrings.add("Allison");
        listOfStrings.add("He");
        listOfStrings.add("Sandul");
        listOfStrings.add("Sujit");
        listOfStrings.add("Jeffrey");
        listOfStrings.add("Yaocheng");
    }

    
    
    @Test
    public void testFilter(){
        ContainsA sc = new ContainsA();
        this.populateList();
        List<String> returnedResult = ListExamples.filter(listOfStrings, sc);
        assertEquals(2, returnedResult.size());
        assertEquals("Sandul",returnedResult.get(0));
        assertEquals("Yaocheng", returnedResult.get(1));

    }
    protected class ContainsA implements StringChecker{
        @Override
        public boolean checkString(String s) {
            // TODO Auto-generated method stub
            return s.contains("a");
        }
    }
    @Test
    public void testMerge(){
        List<String> alphabet1 = new ArrayList<>();
        List<String> alphabet2 = new ArrayList<>();
        List<String> alphabet3 = new ArrayList<>();
        alphabet2.add("a");
        alphabet3.add("a");

        List<String> returnedResult = ListExamples.merge(alphabet1, alphabet2);
        assertEquals(1, returnedResult.size());
        assertEquals(returnedResult, alphabet3);
        /*assertEquals("a",returnedResult.get(0));
        assertEquals("b", returnedResult.get(1));
        assertEquals("c", returnedResult.get(2));
        assertEquals("d", returnedResult.get(3));
        assertEquals("e", returnedResult.get(4));
        assertEquals("f", returnedResult.get(5));*/



    }
}
