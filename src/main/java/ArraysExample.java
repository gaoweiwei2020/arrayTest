public class ArraysExample {

    public static int[] findElementsForTarget(int[] arrInt , int target) {

        for(int startIndex = 0 ; startIndex < arrInt.length - 1 ; startIndex++){
            for(int second = startIndex + 1 ; second < arrInt.length;second++){
                if((arrInt[startIndex] + arrInt[second]) == target){
                    return new int[]{startIndex , second};
                }

            }
        }

        return null;
    }
}
