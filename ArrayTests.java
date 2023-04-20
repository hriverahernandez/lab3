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
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test 
	public void testReverseInPlace2() {
    int[] input1 = {9, 8, 7 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{7, 8, 9}, input1);
	}

  @Test
  public void testReversed2() {
    int[] input1 = { 1, 2, 3};
    assertArrayEquals(new int[]{3, 2, 1}, ArrayExamples.reversed(input1));
  }

  @Test
  public void testAverageWithoutLowest() {
    double[] input1 = {0.0, -1.0, 6};
    assertEquals(3.0, ArrayExamples.averageWithoutLowest(input1), 0.0);
  }

  @Test
  public void testAverageWithoutLowest2() {
    double[] input1 = {55, 55, 55, 55, 1, 55, 55};
    assertEquals(55.0, ArrayExamples.averageWithoutLowest(input1), 0.0);
  }
}
