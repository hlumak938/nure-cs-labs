package Task1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

class MainTest {
    @Test
    public void LengthCheckAndNumsGreaterAverage(){
        int[] arr = new int[] {320, 5, 4932, 54, 586};
        int[] ArrOfLengths = new int[arr.length];
        Assertions.assertEquals(2.6, Main.FindAverageLength(arr, ArrOfLengths));
        ArrayList<Integer> expectedArr = new ArrayList<>();
        expectedArr.add(320);
        expectedArr.add(4932);
        expectedArr.add(586);
        Assertions.assertEquals(expectedArr, Main.PrintNumsGreaterAverage(arr,
                ArrOfLengths, 2.6));
    }
    @Test
    public void NegativeNumsCheckAndNumsSmallerAverage(){
        int[] arr = new int[] {-320, 5, -4932, 54, 586};
        int[] ArrOfLengths = new int[arr.length];
        Main.FindAverageLength(arr, ArrOfLengths);
        ArrayList<Integer> expectedArr = new ArrayList<>();
        expectedArr.add(5);
        expectedArr.add(54);
        Assertions.assertEquals(expectedArr, Main.PrintNumsSmallerAverage(arr,
                ArrOfLengths, 2.6));
    }
}