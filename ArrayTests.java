import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}

  @Test
  public void testReverseInPlaceMultipleItemArray() {
    int[] input1 = {3,4,5};
    ArrayExamples.reverseInPlace(input1);
            assertArrayEquals(new int[]{5,4,3}, input1);
  }

  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReversedOneElement() {
    int[] input1 = {0};
    assertArrayEquals(new int[] {0}, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReversedMultipleItemArray() {
    int[] input1 = {3,4,5};
    assertArrayEquals(new int[]{5,4,3}, ArrayExamples.reversed(input1));
  }

  @Test
  public void testAverageWithoutLowest(){
    double[] input1 = {3,4,5,3};
    assertEquals(4.0, ArrayExamples.averageWithoutLowest(input1),0.0);
  }
}
