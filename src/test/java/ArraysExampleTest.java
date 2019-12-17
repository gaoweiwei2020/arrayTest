import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

public class ArraysExampleTest {
    @Test
    public void arraysFindIndex() {

        int[] arr1 = {1,3,4,2};
        int target1 = 7;
        int[] index = {1,2};
        System.out.println(Arrays.toString(ArraysExample.findElementsForTarget(arr1,target1)));
        Assert.assertEquals(ArraysExample.findElementsForTarget(arr1,target1), index);
        int[] arr2 = {1,3,4,2};
        int target2 = 5;
        int[] index2 = {0,2};
        System.out.println(Arrays.toString(ArraysExample.findElementsForTarget(arr2,target2)));
        Assert.assertEquals(ArraysExample.findElementsForTarget(arr2,target2), index2);

    }
}
