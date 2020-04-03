import org.junit.Test;
import static org.junit.Assert.assertTrue;
import java.util.Arrays;

public class TestInsertSort{
  @Test
  public void TestCase1(){
    int[] expected = {1, 2, 3, 4, 5};
    int[] input = {2, 1, 3, 5,4};
    assertTrue(compare(InsertionSort.insertionSort(input), expected));
  }
  public boolean compare(int[] arr1, int[] arr2) {
      if (arr1.length != arr2.length) {
        return false;
      }
      for (int i = 0; i < arr1.length; i++) {
        if (arr1[i] != arr2[i]) {
          return false;
        }
      }
      return true;
    }
}
